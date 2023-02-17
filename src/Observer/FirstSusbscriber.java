package Observer;

public class FirstSusbscriber implements SubScriberParent{

    public FirstSusbscriber()
    {
      Amazon instance=Amazon.getInstance();
      instance.registerSubscriber(this);
    }
    @Override
    public ReturnData orderPlaced() {
        ReturnData r=new ReturnData("First Suscbriber placed");
        System.out.println("First Suscbriber placed");
        return r;
    }
}
