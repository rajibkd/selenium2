package PageFactorySearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/28/17.
 */

public class DropDownMenus extends CommonAPI{

    @FindBy(how= How.XPATH,using=".//*[@id='menu0']")
    public static WebElement productsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu1']")
    public static WebElement brandsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu2']")
    public static WebElement dealsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu3']")
    public static WebElement servicesMenu;

    public void dropDownMenu()throws InterruptedException{
        productsMenu.click(); sleepFor(1);
        brandsMenu.click(); sleepFor(1);
        dealsMenu.click(); sleepFor(1);
        servicesMenu.click(); sleepFor(1);
    }
}
