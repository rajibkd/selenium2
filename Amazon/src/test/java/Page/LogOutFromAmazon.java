package Page;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pageFactoryLogin.LogInInfo;
import pageFactoryLogin.LogInInfo.*;
import org.testng.annotations.Test;

/**
 * Created by Rajib on 1/23/2017.
 */
public class LogOutFromAmazon extends CommonAPI {

    @Test
    public void logOutFromAmazon() throws InterruptedException{
        LogInInfo LO=PageFactory.initElements(driver,LogInInfo.class);
        LO.AmazonLogin("rajib_delhi@hotmail.com","rakuda00");
        LO.sleepFor(5);
        LO.AmazonLogout();
        LO.sleepFor(2);
        System.out.println("You need to Login First");
    }

}
