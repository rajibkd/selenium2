package hpElements;

import Base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.IOException;

/**
 * Created by ahoura on 1/19/17.
 */
public class LocationElmn extends CommonAPI {

    @FindBy(how= How.XPATH, using=".//*[@id='BtnLocationFinder']")
    WebElement locationButton;

    @FindBy(how=How.XPATH, using=".//*[@id='keyword']")
    WebElement searchLocation;
    @FindBy(how= How.ID, using="cmlink_FindBtn_CitiLocate")
    WebElement findButton;

    public void searchButton(String wLocation) throws InterruptedException, IOException {

        locationButton.click();
        searchLocation.sendKeys(wLocation);
        findButton.click();
        Thread.sleep(5000);


    }

    }

