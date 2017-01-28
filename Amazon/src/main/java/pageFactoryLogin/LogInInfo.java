package pageFactoryLogin;

import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Rajib on 1/11/2017.
 */
public class LogInInfo extends CommonMethods{
    WebDriver driver;

    public LogInInfo(WebDriver driver) {
        this.driver = driver;
    }
    By userName = By.cssSelector("#ap_email");
    By Password = By.cssSelector("#ap_password");
    By submit = By.xpath(".//*[@id='signInSubmit']");

    public WebElement EmailID() {
        return driver.findElement(userName);
    }

    public WebElement password() {
        return driver.findElement(Password);
    }

    public WebElement Submit() {
        return driver.findElement(submit);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public static WebElement AccountLogInLink;

    @FindBy(how=How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement UserId;

    @FindBy(how=How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement UserPass;

    @FindBy(how=How.XPATH, using = ".//*[@id='signInSubmit']")
    public static WebElement LoginSubmit;

    public void setLogOutLink()
    {
        mouseHoverByXpath(".//*[@id='nav-link-accountList']/span[2]");
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[2]")
    public static WebElement AccountLogOutLink;

    @FindBy(how=How.XPATH, using = ".//*[@id='nav-item-signout']/span")
    public static WebElement LogoutSubmit;

    public void AmazonLogin(String userID, String userPass)
    {
        AccountLogInLink.click();
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginSubmit.click();
    }

    public void AmazonLogout()
    {
        mouseHoverByXpath(".//*[@id='nav-link-accountList']/span[2]");
        LogoutSubmit.click();

    }
}
