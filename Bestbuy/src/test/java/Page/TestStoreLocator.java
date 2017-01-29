package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.StoreLocator;

/**
 * Created by admin on 1/29/17.
 */
public class TestStoreLocator extends BBCommonAPI {

    @Test
    public void testStoreLocator() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingListOption();
        //sleepFor(1);
        StoreLocator loc = PageFactory.initElements(driver, StoreLocator.class);
        loc.storeLocatorButton();
    }
}
