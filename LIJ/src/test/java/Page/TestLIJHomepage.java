package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Rajib on 1/3/2017.
 */
public class TestLIJHomepage extends CommonAPI{
    @Test
    public void testLIJHomepage(){
        System.out.println("Our Test is successful for  :"+driver.getCurrentUrl());
        //clickByXpath("//*[@id='nav-xshop']/a[2]");
    }
}
