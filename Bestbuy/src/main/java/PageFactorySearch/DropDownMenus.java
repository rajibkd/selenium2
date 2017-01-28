package PageFactorySearch;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 1/27/17.
 */
public class DropDownMenus extends CommonAPI{
    WebDriver pageDriver;

//    public List<String> getMenus(){
//        List<String> items = new ArrayList<String>();
//        items = getListOfWebElementsById(gh-search-input);
//        return items;

    @FindBy(how= How.XPATH, using=".//*[@id='menu0']")
    public static WebElement productsMenu;

    @FindBy(how=How.XPATH, using =".//*[@id='menu1']")
    public static WebElement brandsMenu;

    @FindBy(how=How.XPATH, using =".//*[@id='menu2']")
    public static WebElement dealsMenu;

    @FindBy(how=How.XPATH, using =".//*[@id='menu3']")
    public static WebElement servicesMenu;

//    public void input() {
//        keysInput("#gh-search-input");
//    }
//    public void clearBox() {
//        clearInput("#gh-search-input");
//    }
    public DropDownMenus(WebDriver driver){
        this.pageDriver=driver;
        PageFactory.initElements(driver, this);
    }
}
