package Page;

import BBMethods.BBCommonAPI;
import PageFactorySearch.DropDownMenus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/27/17.
 */
public class TestDropdownMenus extends BBCommonAPI{

    @Test
    public void DropDownMenu() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingListOption();
        sleepFor(1);

        DropDownMenus dd = PageFactory.initElements(driver,DropDownMenus.class);
        dd.dropDownMenu();
    }
}
