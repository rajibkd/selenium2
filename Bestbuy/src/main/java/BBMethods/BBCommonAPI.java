package BBMethods;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/18/17.
 */
public class BBCommonAPI extends CommonAPI{
    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");

    @FindBy(how = How.CSS, using = ".close")
    public static WebElement closeMailingList;

    @FindBy(how = How.CSS, using = "#profileMenuWrap1")
    public static WebElement signInMenuBtn;
    @FindBy(how = How.CSS, using = ".action-btn")
    public static WebElement signInBtn;
    @FindBy(how=How.CSS,using=".close")
    public static WebElement closePopByClose;
    @FindBy(how = How.CSS, using = ".close-icon")
    public static WebElement closePopByCloseIcon;
    @FindBy(how = How.CSS, using = "#fld-e")
    public static WebElement enterEmailField;
    @FindBy(how = How.CSS, using = "#fld-p1")
    public static WebElement enterPasswordField;
    @FindBy(how = How.CSS, using = ".cia-form__submit-button.js-submit-button")
    public static WebElement submitCredentials;

    public void successfulLogIn() throws InterruptedException{
        sleepFor(2);
        signInMenuBtn.click();
        signInBtn.click();
        enterEmailField.sendKeys(username);
        enterPasswordField.sendKeys(password);
        submitCredentials.click();
        sleepFor(1);
    }
    public BBCommonAPI secureLogin() throws InterruptedException {
        enterEmailField.sendKeys(username);
        enterPasswordField.sendKeys(password);
        submitCredentials.click(); sleepFor(3);
        return new BBCommonAPI();
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            if (webElement.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    public void clickIfElementPresent(WebElement webElement){
        if(isElementPresent(webElement)==true) {
            webElement.click();
        }
    }
    public void refuseMailingList() {
        clickIfElementPresent(closeMailingList);
    }

    public void closePopByCloseIcon() throws InterruptedException{
        clickIfElementPresent(closePopByCloseIcon);
    }
    public void closePopByClose() throws InterruptedException {
        clickIfElementPresent(closePopByClose);
    }
//    public void refuseMailingList(){
//        if (closeMailingList.isDisplayed()){
//            closeMailingList.click();
//        }
    }
//        public void refuseMailingList() {
//        closeMailingList.click();
//        }


