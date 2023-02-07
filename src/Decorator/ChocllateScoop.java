package Decorator;
//can only be a topping we are here restricting it as tooping by specifying it as paramaetrized constructor
public class ChocllateScoop implements Icecream{
    private Icecream icecream;

    public ChocllateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" ChoclateScoop";
    }
}
