package ParkingLot.service;

import ParkingLot.model.enums.VehicleType;

import java.util.List;

public class SlotService {

    public boolean matches(List<VehicleType> vehicleTypeList,VehicleType vehicleType)
    {
        for(VehicleType vehicleType1:vehicleTypeList)
        {
            if(vehicleType1.equals(vehicleType))
            {
                return true;
            }
        }
        return false;
    }
}
