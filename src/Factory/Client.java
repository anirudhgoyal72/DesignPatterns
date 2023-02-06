package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Flutter;
import Factory.Components.Menu.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlatform.ANDROID);
        Menu menu=flutter.createUIFactory().createMenu();
        Button button=flutter.createUIFactory().createButton();

        Dropdown dropdown=flutter.createUIFactory().createDropdown();

    }



}
