package ParkingLot.service;

import ParkingLot.exceptions.NoParkingSlotException;
import ParkingLot.model.*;
import ParkingLot.model.enums.VehicleType;
import ParkingLot.repository.TicketRepository;
import ParkingLot.strategy.slotassignment.Slotassignment;
import ParkingLot.strategy.slotassignment.SlotassignmentStrategy;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private Slotassignment slotassignment;

    public TicketService(VehicleService vehicleService, GateService gateService,Slotassignment slotassignment, TicketRepository ticketRepository) {
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.slotassignment=slotassignment;
        this.ticketRepository = ticketRepository;
    }

    private TicketRepository ticketRepository;


    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, Long gateId,ParkingLot parkingLot) throws NoParkingSlotException {
        // Check if this vehicle is there in DB
        //    1. VehicleService.getVehicleByNumber() - Approach
        //    2. VehicleRepository.fetchByNumber()
        // If yes, get vehicle object
        // Else, create a vehicle
        // Create a Ticket

        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);

        if (vehicle == null) {
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getOperator());
        ticket.setGate(gate);

        ParkingSlot parkingSlot = slotassignment.getSlot(parkingLot,vehicleType);

        if (parkingSlot == null) {
            throw new NoParkingSlotException("There is no parking slot avaliable");
        }

        ticket.setParkingSlot(parkingSlot);

        Ticket savedTicket = ticketRepository.save(ticket);

        return savedTicket;
    }



}
