package Observer;

public class Client {
   public static void main(String[] args) {
      Amazon amazon=Amazon.getInstance();
      FirstSusbscriber firstSusbscriber=new FirstSusbscriber();
      SecondSubscriber secondSubscriber=new SecondSubscriber();
      amazon.notifySubscriber();
      amazon.unRegisterSubscriber(secondSubscriber);
      amazon.notifySubscriber();

   }


}
