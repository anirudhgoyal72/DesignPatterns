package ParkingLot.model;

import ParkingLot.model.enums.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;

    public GateType getGateType() {
        return gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }



}
