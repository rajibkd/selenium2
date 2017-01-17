package ItemsSearch;

import PageFactorySearch.SearchItems;
import Base.CommonAPI;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Rajib on 1/15/2017.
 */

public class SearchUtilities extends CommonAPI {
    ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
    SearchItems search = PageFactory.initElements(driver, SearchItems.class);
    public void searchItems()throws IOException,InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getData();
        for(int i=1; i<value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
