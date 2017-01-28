package Shopping;

import Base.CommonAPI;
import Page.LogOutFromAmazon;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Rajib on 1/25/2017.
 */
public class FindAndAddToCart extends CommonAPI {

    @Test
    public void findAndAddToCart() throws InterruptedException{
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Computers");
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell 7470");
        driver.findElement(By.cssSelector("span.s-highlight-primary")).click();
        driver.findElement(By.xpath("//li[@id='result_0']/div/div/div/div[2]/div[2]/div/a/h2")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("siNoCoverage-announce")).click();
        driver.findElement(By.xpath(".//*[@id='hlb-view-cart-announce']")).click();
        driver.findElement(By.xpath(".//*[@id='sc-buy-box-ptc-button']/span/input")).click();
        driver.findElement(By.id("ap_email")).clear();
        driver.findElement(By.id("ap_email")).sendKeys("rajib_delhi@hotmail.com");
        driver.findElement(By.id("ap_password")).clear();
        driver.findElement(By.id("ap_password")).sendKeys("rakuda00");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.cssSelector("#nav-item-signout > span.nav-text")).click();
    }
}
