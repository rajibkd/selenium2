package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.Methods.BBCommonAPI;
import ui.HomePage.UiHomepage;

/**
 * Created by admin on 1/20/17.
 */
public class TestHomePage extends BBCommonAPI {

    @Test
    public void testTopNav() throws InterruptedException {
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();

        sleepFor(1);
        ui.products();
        clickByXpath(".//*[@id='group0']/div[1]/div[1]/ul/li[1]/a");
        sleepFor(1);
    }
}
