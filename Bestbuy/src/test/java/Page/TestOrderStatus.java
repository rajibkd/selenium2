package Page;

import BBMethods.BBCommonAPI;
import ui.OrderStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/29/17.
 */
public class TestOrderStatus extends BBCommonAPI{

        @Test
        public void testStoreLocator() throws InterruptedException{
            BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
            bb.refuseMailingListOption();

            OrderStatus os = PageFactory.initElements(driver, OrderStatus.class);
            os.orderStatusButton();
        }
}
