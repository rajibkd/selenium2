package Page;

import Base.CommonAPI;
import HomePage.LoginPage;
import LandingPageFactory.LandingPage;
import Methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import java.io.IOException;

/**
 * Created by Unaer on 1/28/2017.
 */
public class TestLandingPage extends CommonAPI{

    @Test(priority = 1)
    public void InputID () throws InterruptedException {
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
        login_page.login_facebook("testunae123@gmail.com", "test123456");
        Thread.sleep(5000);

    }public void inputName() throws InterruptedException {
         LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
          landingPage.searchName.sendKeys("Unae Richardson");
          Thread.sleep(5000);

      }


     public void welcomeEx()throws InterruptedException{
              LandingPage landingPage =PageFactory.initElements(driver, LandingPage.class);
              landingPage.createPost.sendKeys("Testing Post");
                Thread.sleep(5000);

}}