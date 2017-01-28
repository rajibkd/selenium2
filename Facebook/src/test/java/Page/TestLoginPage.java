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
    public void InputID()

    {
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
        login_page.login_facebook("Unaer7@gmail.com", "demo123");


    }
}