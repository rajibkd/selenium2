package PageFactorySearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/26/17.
 */
public class SearchItems {

    @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']")
    public static WebElement searchSubmit ;

    @FindBy(xpath = ".//*[@id='gh-search-input']")
    public static WebElement searchField;

    @FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[2]/form/button")
    public static WebElement searchButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
    public static WebElement searchInput;

    public void clearInput() {searchInput.clear();}

    public void searchFor(String item) throws InterruptedException {
        searchInput.sendKeys(item, Keys.ENTER);
    }
}
