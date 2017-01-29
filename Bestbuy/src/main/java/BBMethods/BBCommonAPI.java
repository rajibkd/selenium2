package BBMethods;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/18/17.
 */
public class BBCommonAPI extends CommonAPI {

    //getting credentials from env. var
    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");

    //user  login
    public void userLogin() throws InterruptedException {
        waitUntilClickAble(By.xpath(".//*[@id='profileMenuWrap1']"));
        clickByXpath(".//*[@id='profileMenuWrap1']");
        clickByXpath(".//*[@id='profileMenu1']/a");
        typeByXpath(".//*[@id='fld-e']", username);
        typeByXpath(".//*[@id='fld-p1']", password);
        clickByXpath("html/body/section/main/div[1]/div[1]/div/form/button");
        sleepFor(2);
    }
    @FindBy(how = How.XPATH,using = "html/body/div[5]/div/div/div[1]/button")
    public WebElement closeMailingListScreen;
    public void refuseMailingListOption()throws InterruptedException{
        sleepFor(1);
        closeMailingListScreen.click();
        sleepFor(1);
    }
}