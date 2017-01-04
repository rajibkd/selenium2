package Page;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Rajib on 1/3/2017.
 */
public class TestAlibabaHomepage extends CommonAPI {
    @Test
    public void testAlibabaHomepage(){

        System.out.println("Our Test is successful for  :"+driver.getCurrentUrl());
        //clickByXpath("//*[@id='nav-xshop']/a[2]");
    }

}
