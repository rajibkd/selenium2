package Page;
import HomePage.FacebookHomePage;
import HomePage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.bcel.generic.Visitor;

import Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by Rajib on 1/3/2017.
 */

public class TestFacebookHomepage extends CommonAPI {
    @Test
    public void InputFirstName()
//creating a new account on facebook homepage
    {

        FacebookHomePage login_page = PageFactory.initElements(driver, FacebookHomePage.class);
        login_page.firstName.sendKeys("Molang");
    }

    @Test
    public void InputLastName() {

        FacebookHomePage login_page = PageFactory.initElements(driver, FacebookHomePage.class);
        login_page.lastName.sendKeys("Bunny");

    }

    @Test
    public void InputEmail() {

        FacebookHomePage login_page = PageFactory.initElements(driver, FacebookHomePage.class);
        login_page.mobileNumber.sendKeys("1234567");
    }

    @Test
    public void InputNewPass() {
        FacebookHomePage login_page = PageFactory.initElements(driver, FacebookHomePage.class);
        login_page.createPassword.sendKeys("testing");

    }



}



