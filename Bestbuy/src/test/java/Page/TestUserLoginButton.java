package Page;

import BBMethods.BBCommonAPI;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.UserLoginButton;

public class TestUserLoginButton extends CommonAPI {
    //getting credentials from env.Var
    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");

    @Test
    public void testUserLogin() throws InterruptedException{
        BBCommonAPI bbapi = PageFactory.initElements(driver,BBCommonAPI.class);
        bbapi.refuseMailingListOption();

        UserLoginButton ul = PageFactory.initElements(driver, UserLoginButton.class);
        ul.userLoginButton();
        sleepFor(1);

        typeByXpath(".//*[@id='fld-e']", username);
        typeByXpath(".//*[@id='fld-p1']", password);
        clickByXpath("html/body/section/main/div[1]/div[1]/div/form/button");
        sleepFor(1);
    }
}



