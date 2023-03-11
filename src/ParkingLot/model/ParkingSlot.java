package ParkingLot.model;

import ParkingLot.model.enums.Status;
import ParkingLot.model.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private Status parkingSlotStatus;

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "parkingSlotStatus=" + parkingSlotStatus +
                ", parkingFloor=" + parkingFloor +
                ", supportedVehicleType=" + supportedVehicleType +
                ", number=" + number +
                '}';
    }

    private ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleType;

    private int number;

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
