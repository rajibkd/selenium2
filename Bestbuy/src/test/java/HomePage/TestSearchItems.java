package HomePage;

import PageFactory.CommonMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItems extends CommonMethods {

    @Test
    @Parameters("item")
    public void testSearchFor() throws InterruptedException{
        closeMailingListOption();
        searchFor("item");
    }
}
