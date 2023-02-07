package Decorator;

//can only be a base not a tooping
public class OrangeCone implements Icecream{

    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone ";
    }
}
