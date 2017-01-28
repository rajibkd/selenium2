package Shopping;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactoryLogin.LogInInfo;

/**
 * Created by Rajib on 1/25/2017.
 */
public class DeleteFromCart extends CommonAPI {

    @Test
    public void deleteFromCart() throws InterruptedException{
        LogInInfo LI = PageFactory.initElements(driver, LogInInfo.class);
        LI.AmazonLogin("rajib_delhi@hotmail.com","rakuda00");
        driver.findElement(By.cssSelector("#nav-cart > span.nav-line-2")).click();
        driver.findElement(By.cssSelector("#nav-cart > span.nav-line-2")).click();
        driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
        driver.findElement(By.partialLinkText("Delete")).click();
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.cssSelector("#nav-item-signout > span.nav-text")).click();
    }
}
