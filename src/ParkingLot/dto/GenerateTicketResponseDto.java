package ParkingLot.dto;

import ParkingLot.model.Ticket;

import java.util.Date;

public class GenerateTicketResponseDto {
    private ResponseStatus responseStatus;
    private String vehicleNo;

    @Override
    public String toString() {
        return "GenerateTicketResponseDto{" +
                "responseStatus=" + responseStatus +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", ticket=" + ticket +
                ", parkingFloor=" + parkingFloor +
                ", entryTime=" + entryTime +
                ", operatorName='" + operatorName + '\'' +
                '}';
    }

    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private int parkingFloor;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(int parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    private Date entryTime;

    private String operatorName;


}
