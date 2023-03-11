package ParkingLot.controller;

import ParkingLot.dto.GenerateTicketRequestDto;
import ParkingLot.dto.GenerateTicketResponseDto;
import ParkingLot.dto.ResponseStatus;
import ParkingLot.exceptions.NoParkingSlotException;
import ParkingLot.model.ParkingSlot;
import ParkingLot.model.Ticket;
import ParkingLot.service.TicketService;

public class TicketController {

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    private TicketService ticketService;

    public GenerateTicketResponseDto generateTicketResponseDto(GenerateTicketRequestDto request)
    {
              try{

                  Ticket ticket = ticketService.generateTicket(
                          request.getVehicleNumber(), request.getVehicleType(), request.getGateId(),
                          request.getParkingLot()
                  );
                  GenerateTicketResponseDto responseDto=new GenerateTicketResponseDto();
                  responseDto.setResponseStatus(ResponseStatus.SUCCESS);
                  responseDto.setTicket(ticket);
                  return  responseDto;

              }
              catch(NoParkingSlotException exception)
              {
                  GenerateTicketResponseDto responseDto=new GenerateTicketResponseDto();
                  responseDto.setResponseStatus(ResponseStatus.FAILURE);
                  return responseDto;
              }
    }


}
