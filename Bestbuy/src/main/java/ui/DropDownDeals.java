package ui;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class DropDownDeals extends CommonAPI {


    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[1]/a")
    public  WebElement weeklyAd;

    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[2]/a")
    public  WebElement dayOfTheDay;

    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[3]/a")
    public  WebElement GiftCards;

    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[4]/a")
    public  WebElement GiftIdeasRegistry;

    public void dropDownDeals()throws InterruptedException{
        weeklyAd.click(); sleepFor(1);
        dayOfTheDay.click(); sleepFor(1);
        GiftCards.click(); sleepFor(1);
        GiftIdeasRegistry.click(); sleepFor(1);
    }
}
