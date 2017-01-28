package Page;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pageFactoryLogin.LogInInfo;
import pageFactoryLogin.LogInInfo.*;
import org.testng.annotations.Test;

/**
 * Created by Rajib on 1/23/2017.
 */
public class LogIntoAmazon extends CommonAPI{

    @Test
    public void LoginTest() throws InterruptedException
    {
        LogInInfo LI = PageFactory.initElements(driver, LogInInfo.class);
        LI.AmazonLogin("rajib_delhi@hotmail.com","rakuda00");
    }
}
