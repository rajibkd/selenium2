package Page;

import BBMethods.BBCommonAPI;
import PageFactorySearch.SearchItems;
import dataToSearch.DataToSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItemsByExcel extends BBCommonAPI {

    @Test
    public void search () throws IOException, InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingListOption();
        sleepFor(1);

        DataToSearch DataToSearch = new DataToSearch();
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);

        String [] value = DataToSearch.getData();
            for (int i=1; i<value.length; i++ ) {
                search.searchFor(value[i]);
                sleepFor(2);
                search.clearInput();
            }
    }
}
