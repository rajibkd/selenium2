package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.Methods.CommonMethods;
import ui.HomePage.UiHomepage;

/**
 * Created by admin on 1/20/17.
 */
public class TestHomePage extends CommonMethods {

    @Test
    public void testTopNav() throws InterruptedException {
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();
        sleepFor(2);
        ui.products();
        sleepFor(2);
    }
}
