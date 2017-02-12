package Page;
import HomePage.FacebookHomePage;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


/**
 * Created by Rajib on 1/3/2017.
 */

public class TestFacebookHomepage extends CommonAPI {
    @Test(priority = 1)
   public void InputFirstName() throws InterruptedException
////creating a new account on facebook homepage
    {

        FacebookHomePage page = PageFactory.initElements(driver, FacebookHomePage.class);
        page.firstName.sendKeys("Bob");
        sleepFor(1);
    }

    @Test(priority = 2)
    public void InputLastName() throws InterruptedException {

        FacebookHomePage page = PageFactory.initElements(driver, FacebookHomePage.class);
        page.lastName.sendKeys("tester");
        sleepFor(1);
    }

    @Test(priority = 3)
    public void InputEmail() throws InterruptedException {

        FacebookHomePage page = PageFactory.initElements(driver, FacebookHomePage.class);
        page.mobileNumber.sendKeys("1234567");
        sleepFor(1);
    }

    @Test(priority = 4)
    public void InputNewPass() throws InterruptedException {
        FacebookHomePage page = PageFactory.initElements(driver, FacebookHomePage.class);
        page.createPassword.sendKeys("testing");
        sleepFor(1);
 }

    @Test(priority = 5)
    public void InputBirthday() throws InterruptedException{
        FacebookHomePage page = PageFactory.initElements(driver, FacebookHomePage.class);
        page.selectOptionByVisibleText(page.Month, "Apr");
        sleepFor(1);
        page.selectOptionByVisibleText(page.Day,"12");
        sleepFor(1);
        page.selectOptionByVisibleText(page.Year,"1993");
        sleepFor(1);

        //click on radio button and create account
        clickByXpath(".//*[@id='u_0_i']");
        clickByXpath(".//*[@id='u_0_f']");
    }

}