package ui;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/26/17.
 */
public class SearchItems extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']")
    public  WebElement searchSubmit ;

    @FindBy(xpath = ".//*[@id='gh-search-input']")
    public  WebElement searchField;

    @FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[2]/form/button")
    public  WebElement searchButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
    public  WebElement searchInput;

    public void clearInput() {searchInput.clear();}

    public void searchFor(String item) throws InterruptedException {
        searchInput.sendKeys(item, Keys.ENTER);
        sleepFor(1);
    }
}
