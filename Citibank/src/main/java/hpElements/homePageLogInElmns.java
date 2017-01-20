package hpElements;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by ahoura on 1/18/17.
 */
public class homePageLogInElmns extends CommonAPI {

    /*WebDriver driver;
    public homePageLogInElmns(WebDriver driver){
        this.driver= driver;
    }*/

    @FindBy(how= How.XPATH, using =".//*[@id='username']")
     WebElement userNameLogin;
    @FindBy(how =How.XPATH, using=".//*[@id='password']")
     WebElement passWordLogin;
    @FindBy(how = How.XPATH, using= ".//*[@id='signInBtn']")
     WebElement clickOnSignOn;





    public void loginMethod(String uID,String uPass) throws InterruptedException {

        userNameLogin.sendKeys(uID);
        passWordLogin.sendKeys(uPass);
        clickOnSignOn.click();

    }

}
