package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class Cart {

    @FindBy(how = How.XPATH, using = ".//*[@id='header']/div[1]/div[2]/ul/li[3]/a")
    public WebElement cart;
}

