package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/20/17.
 */
public class TestCart extends BBCommonAPI {

    @Test(priority = 1)
    public void testTopNav() throws InterruptedException {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        bb.refuseMailingListOption();
        sleepFor(1);
    }
}
