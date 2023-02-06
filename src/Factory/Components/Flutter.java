package Factory.Components;

import Factory.SupportedPlatform;
import Factory.UIFactoryFactory;
import Factory.UiFactory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform)
    {
        this.platform=platform;
    }

    public void setTheme()
    {
        System.out.println("theme is set");

    }
    public void setLanguage()
    {
        System.out.println("Language is set");
    }

    public UiFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
