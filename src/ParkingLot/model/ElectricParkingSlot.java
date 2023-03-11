package ParkingLot.model;

public class ElectricParkingSlot extends ParkingSlot {
    private ElectricCharger electricCharger;
    //here we are dependent on electric charger directly so we are not following DI SOLID principle
    //so we have to have interface of electric charger and we can have multiple implementations of it
    //such has tata fast charger,AUDI charger
    //but we can have only abstract class as electric charger because its child classes will not implment some fucntion
    //of parent class electric charger only attributes will change such as tatatype charger will have only attributes
    //different from parent class electric charger other than that the methods will not be same
    //so thats why we can use abstarct class here


    public ElectricCharger getElectricCharger() {
        return electricCharger;

    }

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
