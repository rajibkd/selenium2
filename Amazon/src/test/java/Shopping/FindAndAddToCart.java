package Shopping;

import Base.CommonAPI;
import Page.LogOutFromAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageFactoryLogin.LogInInfo;


/**
 * Created by Rajib on 1/25/2017.
 */
public class FindAndAddToCart extends CommonAPI {

    @Test
    public void findAndAddToCart() throws InterruptedException{
        LogInInfo LI = PageFactory.initElements(driver, LogInInfo.class);
        LI.AmazonLogin("rajib_delhi@hotmail.com","rakuda00");
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Computers");
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell 7470");
        driver.findElement(By.cssSelector("span.s-highlight-primary")).click();
        driver.findElement(By.xpath("//li[@id='result_0']/div/div/div/div[2]/div[2]/div/a/h2")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#siNoCoverage-announce")).click();
        LI.AmazonLogout();
    }
}
