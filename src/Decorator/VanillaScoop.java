package Decorator;
//can only be a topping we are here restricting it as tooping by specifying it as paramaetrized constructor
public class VanillaScoop implements Icecream{
    private Icecream icecream;

    public VanillaScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+40;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" VanillaScoop";
    }
}
