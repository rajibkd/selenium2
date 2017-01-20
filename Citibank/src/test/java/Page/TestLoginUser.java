package Page;


import Base.CommonAPI;
import hpElements.homePageLogInElmns;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by ahoura on 1/18/17.
 */
public class TestLoginUser extends CommonAPI {

    @Test(priority = 0)
    public void logInTest() throws InterruptedException{

        homePageLogInElmns hpE= PageFactory.initElements(driver, homePageLogInElmns.class);

        hpE.loginMethod("zakharebarghi","zakhareAslie");


    }

}
