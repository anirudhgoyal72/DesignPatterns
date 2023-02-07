package Decorator;
//can be a base as well ass topping
public class VanillaCone implements Icecream{
    private Icecream icecream;

    public VanillaCone(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        if(icecream!=null)
        {
            return icecream.getCost()+20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if(icecream!=null)
        {
            return icecream.getDescription()+" VanillaCone";
        }
        return "VanillaCone";
    }

    public VanillaCone()
    {

    }

}
