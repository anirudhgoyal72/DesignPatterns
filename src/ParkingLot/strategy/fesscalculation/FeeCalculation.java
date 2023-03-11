package ParkingLot.strategy.fesscalculation;

import ParkingLot.model.Ticket;

public interface FeeCalculation {
    int calculateFees(Ticket ticket);
}
