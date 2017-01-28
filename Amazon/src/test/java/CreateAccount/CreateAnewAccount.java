package CreateAccount;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pageFactoryLogin.LogInInfo;
import pageFactoryLogin.LogInInfo.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Created by Rajib on 1/24/2017.
 */
public class CreateAnewAccount extends CommonAPI {
    @Test
    public void newAccount() throws InterruptedException
    {
        driver.findElement(By.linkText("Start here.")).click();
        driver.findElement(By.id("ap_customer_name")).clear();
        driver.findElement(By.id("ap_customer_name")).sendKeys("Rajib Das");
        driver.findElement(By.id("ap_email")).clear();
        driver.findElement(By.id("ap_email")).sendKeys("rajib@abc.com");
        driver.findElement(By.id("ap_password")).clear();
        driver.findElement(By.id("ap_password")).sendKeys("abcd1234");
        driver.findElement(By.id("ap_password_check")).clear();
        driver.findElement(By.id("ap_password_check")).sendKeys("abcd1234");
        driver.findElement(By.id("continue")).click();
        sleepFor(2);
    }

}
