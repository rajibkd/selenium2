package ui;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class MyAccountPage extends CommonAPI{

    @FindBy(how = How.XPATH, using = "html/body/header/div[1]/div[2]/ul/li[1]/a")
    public  WebElement hiUser;

    @FindBy(how = How.XPATH,using = "html/body/header/div[1]/div[2]/ul/li[1]/div/ul/li[1]/a")
    public WebElement accountHome;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[2]/a")
    public  WebElement purchases;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[3]/a/label")
    public  WebElement rewards;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[4]/a/label")
    public  WebElement support;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[5]/a/label")
    public  WebElement lists;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[6]/a")
    public  WebElement recommendations;

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[7]/a/label")
    public  WebElement profile;

    public void getMyAccountPage ()throws InterruptedException{
        hiUser.click();
        accountHome.click(); sleepFor(1);
        purchases.click(); sleepFor(2);
        //rewards.click(); sleepFor(2);
//        support.click(); sleepFor(1);
//        lists.click(); sleepFor(1);
//        recommendations.click(); sleepFor(1);
//        profile.click(); sleepFor(1);
    }
}
