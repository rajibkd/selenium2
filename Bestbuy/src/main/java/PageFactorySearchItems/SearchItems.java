package PageFactorySearchItems;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by admin on 1/18/17.
 */

public class SearchItems extends CommonApiBestBuy{

    @FindBy(xpath = ".//*[@id='gh-search-input']")
    public static WebElement searchField;

    @FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[2]/form/button")
    public static WebElement searchButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")

    public static WebElement searchInput;
    public void searchFor(String item) {
        searchInput.sendKeys(item, Keys.ENTER);

    }
}
