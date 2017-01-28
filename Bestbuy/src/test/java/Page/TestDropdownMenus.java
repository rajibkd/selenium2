package Page;

import BBMethods.BBCommonAPI;
import PageFactorySearch.DropDownMenus;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/27/17.
 */
public class TestDropdownMenus extends CommonAPI{

    @Test
    public void DropDownMenu() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingListOption();
        sleepFor(2);
        DropDownMenus ddMenus = PageFactory.initElements(driver, DropDownMenus.class);

        ddMenus.productsMenu.click();
        sleepFor(1);
        ddMenus.brandsMenu.click();
        sleepFor(1);
        ddMenus.dealsMenu.click();
        sleepFor(1);
        ddMenus.servicesMenu.click();
        sleepFor(1);

    }
}
