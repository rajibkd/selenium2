package Page;

import Base.CommonAPI;

import HomePage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Unaer on 1/23/2017.
 */
public class TestLoginPage extends CommonAPI {




    @Test
    public void InputID () throws InterruptedException

    {
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
        login_page.login_facebook("testunae123@gmail.com", "test123456");
        sleepFor(2);

    }
}