package Page;

import org.openqa.selenium.support.PageFactory;
import ui.HomePage.UiHomepage;
import ui.Methods.CommonMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItems extends CommonMethods {

    @Test
    @Parameters("item")
    public void testSearchFor() throws InterruptedException{
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();

        super.searchFor("item");
    }
}
