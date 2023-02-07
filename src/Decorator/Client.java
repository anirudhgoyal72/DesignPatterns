package Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream icecream=new VanillaScoop(new ChocllateScoop(new VanillaCone(new OrangeCone())));
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());

    }
}
