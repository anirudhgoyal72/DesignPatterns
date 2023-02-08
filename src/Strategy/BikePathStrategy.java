package Strategy;

public class BikePathStrategy implements PathStrategy{
    private static BikePathStrategy bikePathStrategy;

    private BikePathStrategy()
    {

    }
    public static BikePathStrategy getInstance()
    {
        if(bikePathStrategy==null)
        {
            synchronized (BikePathStrategy.class)
            {
                bikePathStrategy=new BikePathStrategy();
            }
        }
        return bikePathStrategy;
    }
    @Override
    public String getPath(String from, String to) {
        return "Caclculating distance through bike from "+from+" to "+to;
    }
}
