package PageFactorySearchItems;

import Base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by admin on 1/18/17.
 */
public class CommonApiBestBuy extends CommonAPI {

    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");


    public void userLogin()throws InterruptedException{
        clickByXpath(".//*[@id='profileMenuWrap1']");
        clickByXpath(".//*[@id='profileMenu1']/a");
        typeByXpath(".//*[@id='fld-e']", username);
        typeByXpath(".//*[@id='fld-p1']", password);
        sleepFor(3);
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenuWrap1']")).isDisplayed());
        sleepFor(3);
    }
}
