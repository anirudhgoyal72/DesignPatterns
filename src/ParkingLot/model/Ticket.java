package ParkingLot.model;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", operator=" + operator +
                ", vehicle=" + vehicle +
                ", parkingSlot=" + parkingSlot +
                ", gate=" + gate +
                '}';
    }

    private Operator operator;

    private Vehicle vehicle;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    private ParkingSlot parkingSlot;

    private Gate gate;



}
