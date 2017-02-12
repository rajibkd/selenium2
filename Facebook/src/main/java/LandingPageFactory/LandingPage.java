package LandingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Unaer on 1/28/2017.
 */
public class LandingPage  {

    @FindBy(name = "xhpc_message")
    public WebElement barPostStatus;

    @FindBy(className = "_1mf _1mj")
    public WebElement tfPostStatus;

    @FindBy(how = How.XPATH,using=".//*[@id='u_6_2']/input[1]")
    public WebElement searchName;

    @FindBy(id="left_nav_item_News Feed")
    public WebElement welcomeExplore;

    @FindBy(id="Create a Post")
    public WebElement createPost;

}