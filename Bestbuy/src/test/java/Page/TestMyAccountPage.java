package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.MyAccountPage;
import ui.UserLoginButton;

/**
 * Created by admin on 1/29/17.
 */
public class TestMyAccountPage extends BBCommonAPI{
    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");

    @Test
    public void testMyAccountPage() throws InterruptedException{
        BBCommonAPI bbapi = PageFactory.initElements(driver, BBCommonAPI.class);
        bbapi.refuseMailingListOption();
        UserLoginButton ul = PageFactory.initElements(driver, UserLoginButton.class);
        ul.userLoginButton();

        typeByXpath(".//*[@id='fld-e']", username);
        typeByXpath(".//*[@id='fld-p1']", password);
        clickByXpath("html/body/section/main/div[1]/div[1]/div/form/button");
        sleepFor(1);

        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenuWrap1']")).isDisplayed());
        MyAccountPage map = PageFactory.initElements(driver, MyAccountPage.class);
        map.getMyAccountPage(); sleepFor(1);
    }
}
