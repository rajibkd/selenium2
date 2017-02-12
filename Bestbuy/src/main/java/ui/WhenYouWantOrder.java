package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 2/3/17.
 */
public class WhenYouWantOrder extends BBCommonAPI {

    public static final String notMyPhone = System.getenv("NOT_MY_PHONE");

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div/div/div[3]/div[2]/section/form/div[2]/section/div[3]/label/div/input")
    public static WebElement phone;
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div/div/div[3]/div[2]/section/form/div[2]/div[2]/button")
    public static WebElement continueToPaymentInfo;

    public  WhenYouWantOrder confirmPhone () throws InterruptedException{
        sleepFor(1);
        phone.sendKeys(notMyPhone);
        continueToPaymentInfo.click(); sleepFor(2);
        return new WhenYouWantOrder();
    }
}
