package Page;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rajib on 1/3/2017.
 */
public class TestFacebookHomepage extends CommonAPI {
    @Test
    public void testFacebookHomepage(){
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("Our Test is successful for  :"+driver.getCurrentUrl());
        //facebook homepage button
        clickByXpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i");
        //
        clickByXpath(".//*[@id='content']/div/div/div/div/div[2]/h2");
        clickByXpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]");
        clickByXpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a");
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='identify_yourself_flow']/div/div[3]/div/div[2]/a")).isDisplayed());
        clickByXpath(".//*[@id='identify_yourself_flow']/div/div[3]/div/div[2]/a");
        //finding the specific text
        Assert.assertTrue(driver.getTitle().contains("I can't find my account from the \"Find Your Account\""));

    }
}
