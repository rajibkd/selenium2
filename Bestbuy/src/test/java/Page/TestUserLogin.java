package Page;

import org.openqa.selenium.support.PageFactory;
import ui.HomePage.UiHomepage;
import ui.Methods.BBCommonAPI;
import org.testng.annotations.Test;


public class TestUserLogin extends BBCommonAPI {

    @Test
    public void testUserLogin() throws InterruptedException{
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.refuseMailingListOption();

        super.userLogin();
    }
}