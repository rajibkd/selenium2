package LandingPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Unaer on 1/28/2017.
 */
public class LandingPage {
    @FindBy(how= How.XPATH ,using =".//*[@id='js_17']/div")
    public WebElement postStatus;

}
