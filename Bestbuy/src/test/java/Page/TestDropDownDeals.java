package Page;

import BBMethods.BBCommonAPI;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.DropDownDeals;

/**
 * Created by admin on 1/29/17.
 */
public class TestDropDownDeals extends CommonAPI {
    @Test
    public void DropDownMenu() throws InterruptedException{
        BBCommonAPI bbapi = PageFactory.initElements(driver,BBCommonAPI.class);
        bbapi.refuseMailingListOption();

        DropDownDeals ddd = PageFactory.initElements(driver, DropDownDeals.class);
        ddd.dropDownDeals();
        sleepFor(1);
    }
}
