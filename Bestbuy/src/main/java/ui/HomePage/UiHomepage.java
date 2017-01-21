package ui.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ui.methods.CommonMethods;
import ui.Products.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 1/20/17.
 */
public class UiHomepage extends CommonMethods {

    @FindBy(how = How.XPATH, using = "html/body/header/div[2]/div/nav[1]/ul/li[*]/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    @FindBy(how = How.XPATH,using = "html/body/div[3]/div/div/div[1]/button")
    public WebElement closeMailingListScreen;

    public void refuseMailingListOption() {
        closeMailingListScreen.click();
    }

    public Products products() throws InterruptedException {
        elements.get(0).click();
        sleepFor(4);
        return new Products();
    }
}
