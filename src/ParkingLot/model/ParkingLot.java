package ParkingLot.model;

import ParkingLot.model.enums.Status;
import ParkingLot.model.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private String name;
    private String address;
    private Map<VehicleType,Integer> baseRateMap;

    public Map<VehicleType, Integer> getBaseRateMap() {
        return baseRateMap;
    }

    public void setBaseRateMap(Map<VehicleType, Integer> baseRateMap) {
        this.baseRateMap = baseRateMap;
    }

    private Status status;



    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getParkingLotStatus() {
        return status;
    }

    public void setParkingLotStatus(Status status) {
        this.status = status;
    }
}
