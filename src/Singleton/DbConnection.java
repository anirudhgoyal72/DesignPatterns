package Singleton;

public class DbConnection {
    private static DbConnection dbConnectionObject;
    private DbConnection()
    {

    }
    public static DbConnection getDbConnectionObject()
    {
        if(dbConnectionObject==null)
        {
            synchronized (DbConnection.class)
            {
                if(dbConnectionObject==null)
                {
                    dbConnectionObject=new DbConnection();
                }
            }


        }
        return dbConnectionObject;
    }
}
