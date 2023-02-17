package Observer;

public class SecondSubscriber implements SubScriberParent{

    public SecondSubscriber()
    {
        Amazon instance=Amazon.getInstance();
        instance.registerSubscriber(this);


    }
    @Override
    public ReturnData orderPlaced() {
        ReturnData r=new ReturnData("Second Suscbriber placed");
        System.out.println("Second Suscbriber placed");
        return r;
    }
}
