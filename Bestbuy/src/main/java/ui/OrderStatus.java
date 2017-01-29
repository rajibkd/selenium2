package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class OrderStatus {
    @FindBy(how = How.XPATH, using =".//*[@id='header']/div[1]/div[1]/nav/ul/li[2]/a")
    public  WebElement orderStatusButton;

    public void orderStatusButton(){
        orderStatusButton.click();
    }
}
