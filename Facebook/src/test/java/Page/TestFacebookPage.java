package Page;

import LandingPage.FacebookPage;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Unaer on 1/18/2017.
 */
public class TestFacebookPage extends CommonMethods {
    @Test(priority = 1)
    public void testLoginIncorrect() {
        FacebookPage facebookPage = PageFactory.initElements(driver, FacebookPage.class);
        facebookPage.login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        facebookPage.assertIncorrect("incorrectUsername");

    }

    @Test(priority = 2)
    public void testLoginBlankPassword() {

        FacebookPage facebookPage = PageFactory.initElements(driver, FacebookPage.class);
        facebookPage.login(CommonMethods.FacebookUsername, "");
        facebookPage.assertIncorrect("incorrectPassword");
    }

    @Test(priority = 3)
    public void testLoginInccorectPass() {

        FacebookPage facebookPage = PageFactory.initElements(driver, FacebookPage.class);
        facebookPage.login(CommonMethods.FacebookUsername, "incorrectPassword");
        facebookPage.assertIncorrect("incorrectPassword");
    }

    @Test(priority = 4)
    public void testLoginCorrect() {

        FacebookPage facebookPage = PageFactory.initElements(driver, FacebookPage.class);
        facebookPage.login(CommonMethods.FacebookUsername, CommonMethods.FacebookPassword);
        facebookPage.assertSuccessfulLogin();
    }


}