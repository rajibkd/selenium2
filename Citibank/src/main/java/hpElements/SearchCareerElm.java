package hpElements;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;



/**
 * Created by ahoura on 1/19/17.
 */
public class SearchCareerElm extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='whyCiti']/ul/li[2]/a")
    WebElement carrierButton;
    @FindBy(how = How.XPATH, using = ".//*[@id='advanced-search-keyword-b8a87625f6'] ")
    WebElement searchField;

    // .//*[@id='advanced-search-keyword-b8a87625f6']
   //  .//*[@id='advanced-search-keyword-ce5a53fa45'] this is the xPath for searchField which changed to the above xPath the next day i doubled checked for some reason

        public void navigateToSearch (String dataJobsList) {
            carrierButton.click();

            searchField.sendKeys(dataJobsList);

        }
        /*public void fillTheSearch(String dataJobsList){
            searchField.sendKeys(dataJobsList);

        }*/


}


