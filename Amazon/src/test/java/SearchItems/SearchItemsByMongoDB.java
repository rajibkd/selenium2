package SearchItems;

import PageFactorySearch.SearchItems;
import Base.CommonAPI;
import Utility.ConnectMongoDB;
import org.bson.Document;
import org.openqa.selenium.support.PageFactory;
import Utility.ConnectDB;
import  org.testng.annotations.Test;
import pageFactoryLogin.LogInInfo;
import java.lang.String;
import java.sql.ResultSet;
import java.util.List;


/**
 * Created by Rajib on 1/19/2017.
 */

public class SearchItemsByMongoDB extends CommonAPI {
    @Test
    public void searchUsingMongoDB()throws Exception,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read Data From Database
        ConnectMongoDB mdb = new ConnectMongoDB();
        List<Document> st = mdb.getMongoDBData("Amazon","Searchitems");
        for(Document data:st) {
            search.searchFor(data.getString("Items"));
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
