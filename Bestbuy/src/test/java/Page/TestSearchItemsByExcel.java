package Page;

import BBMethods.BBCommonAPI;
import PageFactorySearch.SearchItems;
import base.CommonAPI;
import dataToSearch.ItemsToSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItemsByExcel extends CommonAPI {

    @Test
    public void search () throws IOException, InterruptedException{
        sleepFor(1);
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingListOption();

        ItemsToSearch ItemsToSearch = new ItemsToSearch();

        SearchItems search = PageFactory.initElements(driver, SearchItems.class);

        String [] value = ItemsToSearch.getData();
            for (int i=1;i<value.length; i++ ) {
                search.searchFor(value[i]);
                sleepFor(2);
                search.clearInput();
            }
    }
}
