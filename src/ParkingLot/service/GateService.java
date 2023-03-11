package ParkingLot.service;

import ParkingLot.model.Gate;
import ParkingLot.model.Operator;

public class GateService {

    public Gate getGate(Long id) {
        Gate gate=new Gate();
        Operator operator=new Operator();
        operator.setName("jfjf");
        gate.setOperator(operator);
        return gate;
    }
}
