package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.IOSButton;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Dropdown.IOSDropdown;
import Factory.Components.Menu.IOSMenu;
import Factory.Components.Menu.Menu;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class IOSFactory implements UiFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
