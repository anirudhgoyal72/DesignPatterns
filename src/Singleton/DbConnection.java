package Singleton;

public class DbConnection
{
    private static DbConnection dbConnectionObject;
    private DbConnection()
    {

    }
    public static DbConnection getDbConnectionObject()
    {
        if(dbConnectionObject==null)
        {
            synchronized (DbConnection.class)//or synchronised(this) when using non static methods
            {
                if(dbConnectionObject==null)
                {
                    dbConnectionObject=new DbConnection();

                }
            }


        }
        return dbConnectionObject;
    }

    public static void main(String[] args){

    }
}
