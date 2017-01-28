package Page;

import BBMethods.BBCommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestUserLogin extends BBCommonAPI {

    @Test
    public void testUserLogin() throws InterruptedException{
        sleepFor(1);
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);

        bb.refuseMailingListOption();
        sleepFor(1);
        userLogin();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenuWrap1']")).isDisplayed());
        clickByXpath(".//*[@id='profileMenuWrap1']");
        clickByXpath(".//*[@id='profileMenu1']/ul/li[1]/a");
        sleepFor(2);
    }
}