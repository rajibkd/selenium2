package Page;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Rajib on 1/3/2017.
 */
public class TestAmazonHomepage extends CommonAPI {
    @Test
    public void testAmazonHomepage()throws InterruptedException{

        System.out.println("Our Test is successful for  :"+driver.getCurrentUrl());
        sleepFor(2);
    }

}
