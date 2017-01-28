package Page;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Rajib on 1/24/2017.
 */
public class exploreHomePage extends CommonAPI{

    @Test
    public void exploreHomepage() throws InterruptedException
    {
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-next-rounded")).click();
    }
}
