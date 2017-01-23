package ui.Methods;

import Base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by admin on 1/18/17.
 */
public class BBCommonAPI extends CommonAPI {

        public static final String username = System.getenv("BESTBUY_USERNAME");
        public static final String password = System.getenv("BESTBUY_PASSWORD");

    public void userLogin() throws InterruptedException {
        clickByXpath(".//*[@id='profileMenuWrap1']");
        clickByXpath(".//*[@id='profileMenu1']/a");
        typeByXpath(".//*[@id='fld-e']", username);
        typeByXpath(".//*[@id='fld-p1']", password);
        clickByXpath("html/body/section/main/div[1]/div[1]/div/form/button");
        sleepFor(10);
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenuWrap1']")).isDisplayed());
        sleepFor(2);
    }
    @FindBy(xpath = ".//*[@id='gh-search-input']")
    public static WebElement searchField;

    @FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[2]/form/button")
    public static WebElement searchButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")

    public static WebElement searchInput;

    public void searchFor(String item) throws InterruptedException {
        searchInput.sendKeys(item, Keys.ENTER);

        Assert.assertTrue(driver.findElement(By.className(item)).isDisplayed());
        sleepFor(1);
    }
}