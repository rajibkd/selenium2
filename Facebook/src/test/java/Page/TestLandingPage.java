package Page;

import Base.CommonAPI;
import HomePage.LoginPage;
import LandingPageFactory.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Unaer on 1/28/2017.
 */
public class TestLandingPage extends CommonAPI {

    @Test
            public void InputID() throws InterruptedException {
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
        login_page.login_facebook("testunae123@gmail.com", "test123456");
        sleepFor(2);

        //update status
        LandingPage landingPage= PageFactory.initElements(driver, LandingPage.class);
        landingPage.postStatus.click();
        landingPage.postStatus.sendKeys("Hello, i am feeling happy today");
        sleepFor(2);
    }
}
