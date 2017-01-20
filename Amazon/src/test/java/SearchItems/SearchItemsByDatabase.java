package SearchItems;

import methods.CommonMethods;

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
 * Created by Rajib on 1/15/2017.
 */
public class SearchItemsByDatabase extends CommonAPI {
    @Test
    public void searchUsingDB()throws Exception,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read Data From Database
        ConnectDB db = new ConnectDB();
        List<String> st = db.readDataBase("Searchitems","Items");
        for(String data:st) {
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
