package ParkingLot;

import ParkingLot.controller.TicketController;
import ParkingLot.dto.GenerateTicketRequestDto;
import ParkingLot.dto.GenerateTicketResponseDto;
import ParkingLot.model.ParkingFloor;
import ParkingLot.model.ParkingLot;
import ParkingLot.model.ParkingSlot;
import ParkingLot.model.enums.Status;
import ParkingLot.model.enums.VehicleType;
import ParkingLot.repository.TicketRepository;
import ParkingLot.service.GateService;
import ParkingLot.service.SlotService;
import ParkingLot.service.TicketService;
import ParkingLot.service.VehicleService;
import ParkingLot.strategy.slotassignment.Slotassignment;
import ParkingLot.strategy.slotassignment.SlotassignmentStrategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        GateService gateService = new GateService();
        TicketRepository ticketRepository = new TicketRepository();
        SlotService slotService=new SlotService();

        Slotassignment slotassignment=new SlotassignmentStrategy(slotService);

        TicketService ticketService = new TicketService(
                vehicleService, gateService, slotassignment, ticketRepository
        );
        TicketController ticketController=new TicketController(ticketService);
        GenerateTicketRequestDto request = new GenerateTicketRequestDto();
        request.setVehicleNumber("HR05VXXXX");
        request.setVehicleType(VehicleType.LARGE);
        request.setGateId(1L);
        ParkingLot parkingLot=new ParkingLot();
        ParkingFloor parkingFloor=new ParkingFloor();
        ParkingSlot parkingSlot=new ParkingSlot();
        parkingSlot.setNumber(2);parkingSlot.setParkingSlotStatus(Status.AVAILABLE);
        parkingSlot.setSupportedVehicleType(new ArrayList<>(Arrays.asList(VehicleType.LARGE,VehicleType.MEDIUM,VehicleType.SMALL)));
        parkingFloor.setParkingSlots(new ArrayList<>(Arrays.asList(parkingSlot)));
        parkingLot.setParkingFloors(new ArrayList<>(Arrays.asList(parkingFloor)));
        request.setParkingLot(parkingLot);

        GenerateTicketResponseDto responseDto=ticketController.generateTicketResponseDto(request);
        System.out.println(responseDto.getTicket().getParkingSlot());
    }
}
