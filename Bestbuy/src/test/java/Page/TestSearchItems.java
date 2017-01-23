package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.HomePage.UiHomepage;
import ui.Methods.BBCommonAPI;
/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItems extends BBCommonAPI {

    @Test
    public void testSearchFor() throws InterruptedException{
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();

        super.searchFor("item");
    }
}
