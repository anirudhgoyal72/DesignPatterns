package ParkingLot.strategy.slotassignment;

import ParkingLot.exceptions.NoParkingSlotException;
import ParkingLot.model.ParkingFloor;
import ParkingLot.model.ParkingLot;
import ParkingLot.model.ParkingSlot;
import ParkingLot.model.enums.Status;
import ParkingLot.model.enums.VehicleType;
import ParkingLot.service.SlotService;
import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class SlotassignmentStrategy implements Slotassignment{

    private SlotService slotService;

    public SlotassignmentStrategy(SlotService slotService)
    {
        this.slotService=slotService;
    }
    @Override
    public ParkingSlot getSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor:parkingLot.getParkingFloors())
        {
            for(ParkingSlot slot: floor.getParkingSlots())
            {
                if(slot.getParkingSlotStatus().equals(Status.AVAILABLE) && slotService.matches(slot.getSupportedVehicleType(),vehicleType))
                {
                    return slot;
                }
            }
        }
       return null;
    }
}
