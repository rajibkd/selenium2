package BBMethods;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/18/17.
 */
public class BBCommonAPI extends CommonAPI{

    //close mailPopUp
    @FindBy(how = How.XPATH,using = "html/body/div[5]/div/div/div[1]/button")
    public WebElement closeMailingListScreen;
    public void refuseMailingListOption()throws InterruptedException{
        sleepFor(1);
        closeMailingListScreen.click();

    }
}