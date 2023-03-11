package ParkingLot.strategy.slotassignment;

import ParkingLot.model.ParkingFloor;
import ParkingLot.model.ParkingLot;
import ParkingLot.model.ParkingSlot;
import ParkingLot.model.enums.VehicleType;

public interface Slotassignment {
    public ParkingSlot getSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
