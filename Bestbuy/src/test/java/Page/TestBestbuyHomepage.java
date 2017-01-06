package Page;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import javax.swing.*;

/**
 * Created by Rajib on 1/3/2017.
 */
public class TestBestbuyHomepage extends CommonAPI {

    @Test
    public void testBestbuyHomepage() {
        driver.get("https://bestbuy.com");
        driver.manage().window().maximize();
        System.out.println("Our Test is successful for  :" + driver.getCurrentUrl());
        //testing product button
        clickByXpath(".//*[@id='menu0']");
        clickByXpath(".//*[@id='header']/div[1]/div[2]/div[1]/a/span");
        clickByXpath(".//*[@id='profileMenuWrap1']");

        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenuWrap1']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='profileMenu1']")).isDisplayed());
        clickByXpath(".//*[@id='profileMenu1']/a");
        Assert.assertTrue(driver.findElement(By.xpath("html/body/section/main/div[2]/span")).isDisplayed());

    }


    }
