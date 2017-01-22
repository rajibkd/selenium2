package Page;

import org.openqa.selenium.support.PageFactory;
import ui.HomePage.UiHomepage;
import ui.Methods.CommonMethods;
import org.testng.annotations.Test;


public class TestUserLogin extends CommonMethods{

    @Test
    public void testUserLogin() throws InterruptedException{
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();
        super.userLogin();
    }
}