package Strategy;

public class Client {
    public static void main(String[] args) {
        PathStrategy pathStrategy=PathFactory.getPath("Car");
        System.out.println(pathStrategy.getPath("Mumbai","Delhi"));
        PathStrategy pathStrategy1=PathFactory.getPath("Bike");
        System.out.println(pathStrategy1.getPath("Jodhpur","Agra"));
    }
}
