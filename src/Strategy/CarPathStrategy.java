package Strategy;

public class CarPathStrategy implements PathStrategy{
    private static  CarPathStrategy carPathStrategy;
    private CarPathStrategy()
    {

    }
    public static CarPathStrategy getInstance()
    {
        if(carPathStrategy==null)
        {
            synchronized (CarPathStrategy.class)
            {
                carPathStrategy=new CarPathStrategy();
            }
        }
        return carPathStrategy;
    }
    @Override
    public String getPath(String from, String to) {
        return "Caclculating distance through Car from "+from+" to "+to;
    }
}
