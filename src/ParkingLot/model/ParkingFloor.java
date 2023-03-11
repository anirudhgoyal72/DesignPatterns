package ParkingLot.model;

import ParkingLot.model.enums.Status;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;
    private Status parkingFloorStatus;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Status getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(Status parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public Operator getParkingFloorOperator() {
        return parkingFloorOperator;
    }

    public void setParkingFloorOperator(Operator parkingFloorOperator) {
        this.parkingFloorOperator = parkingFloorOperator;
    }

    private Operator parkingFloorOperator;


}
