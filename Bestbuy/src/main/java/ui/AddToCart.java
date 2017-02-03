package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class AddToCart extends BBCommonAPI {
    public static final String notMyPhone = System.getenv("NOT_MY_PHONE");
    public static final String zipCode = System.getenv("ZIP_CODE");

    @FindBy(how = How.CSS, using = "#gh-search-input")
    public static WebElement searchBar;
    @FindBy(how = How.CSS, using = ".sku-title>h4>a")
    public static WebElement testedItem;
    @FindBy(how = How.XPATH, using = "html/body/div[4]/main/div[4]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div[1]/a")
    public static WebElement addToCart;
    @FindBy(how = How.CSS, using = ".cart")
    public static WebElement goToCart;
    @FindBy(how = How.CSS, using = ".close-icon")
    public static WebElement closePopUp2;
    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[2]/div/div/div[4]/div/div[1]/div[3]/div/div[1]/div[2]/div[1]/div/div[2]/a")
    public static WebElement checkoutBtn;
    @FindBy(how = How.CSS, using = ".ispu-fulfillment__find-store-btn")
    public static WebElement findAStore;
    @FindBy(how = How.CSS, using = ".modal-select-store.modal-select-store--primary")
    public static WebElement continueStore;
    @FindBy(how = How.CSS, using = "#user.phone")
    public static WebElement phone;

    @FindBy(how = How.CSS, using = ".btn.btn-lg.btn-block.btn-primary")
    public static WebElement continueToPaymentInfo;
    @FindBy(how = How.CSS,using = "#location")
    public static WebElement location;
    @FindBy(how = How.CSS,using = ".apply-location")
    public static WebElement checkAvailabiltyGo;

    public void closePopUp() throws InterruptedException {
        sleepFor(1);
        if (closePopUp.isDisplayed()) {
            closePopUp.click();}
    }
    public AddToCart getAddToCart() throws InterruptedException {
//        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
//        bb.refuseMailingList();
        searchBar.sendKeys("5561300", Keys.ENTER); sleepFor(2);
        testedItem.click();sleepFor(3);
        closePopUp();
        addToCart.click();sleepFor(3);
        closePopUp2.click();
        goToCart.click();sleepFor(2);
        checkoutBtn.click();sleepFor(4);
        return new AddToCart();
    }

    public void provideLocation()throws InterruptedException{
        sleepFor(1);
        if (location.isDisplayed()){
            location.sendKeys(zipCode);
            checkAvailabiltyGo.click(); sleepFor(1);}

    }
    public void checkOut() throws InterruptedException{
        findAStore.click();sleepFor(1);
        //provideLocation();
        continueStore.click();sleepFor(1);
        //phone.sendKeys("2406435555");
        //continueToPaymentInfo.click();sleepFor(2);
    }
}
