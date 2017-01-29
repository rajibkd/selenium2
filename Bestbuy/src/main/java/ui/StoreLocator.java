package ui;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class StoreLocator extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/header/div[1]/div[1]/nav/ul/li[3]/a")
    public  WebElement storeLocator;

    @FindBy(how=How.XPATH,using="html/body/div[4]/div/div/div[1]/form/div[3]/input")
    public  WebElement zipCodeField;

    @FindBy(how=How.XPATH,using="html/body/div[4]/div/div/div[1]/form/button")
    public  WebElement findStoresButton;

    @FindBy(how=How.XPATH, using = ".//*[@id='use-current-location']")
    public  WebElement MyCurrentLocationButton;

    public void storeLocatorButton()throws InterruptedException {
    storeLocator.click(); sleepFor(1);

    //MyCurrentLocationButton.click();
    //sleepFor(1);
    //zipCodeField.sendKeys("20002");
    //typeByXpath(".//*[@id='zip-city-state']", "20008")
    //findStoresButton.click();
    //MyCurrentLocationButton.click();
    }
}
