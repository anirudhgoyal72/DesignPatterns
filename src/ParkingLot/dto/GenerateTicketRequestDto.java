package ParkingLot.dto;

import ParkingLot.model.ParkingLot;
import ParkingLot.model.enums.VehicleType;

public class GenerateTicketRequestDto {
    //only the information which gate operator will send through front end by thinking deeper
    private Long gateId;
    private String vehicleNumber;
    //if its new vechicle
    private VehicleType vehicleType;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    private ParkingLot parkingLot;
}
