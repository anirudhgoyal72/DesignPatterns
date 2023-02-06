package Factory;

public class UIFactoryFactory {

    public static UiFactory createUIFactory(SupportedPlatform platform)
    {
        UiFactory factory=null;
        switch(platform)
                {
                    case ANDROID:
                        factory=new AndroidFactory();
                        break;
                    case IOS:
                        factory=new IOSFactory();
                        break;




                }
                return factory;
    }
}
