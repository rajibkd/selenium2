package LandingPage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by Unaer on 1/18/2017.
 */
public class FacebookHomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".fb_logo.img.sp_xOlIFEVne2M.sx_20bf7c")
    public static WebElement HomePageLogo;

    @FindBy(how = How.XPATH, using =".clearfix.loggedout_menubar")
    public static WebElement MenuBarLogo;



}
