package Page;

import Base.CommonAPI;
import hpElements.SearchCareerElm;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by ahoura on 1/19/17.
 */
public class TestCareerSearch extends CommonAPI {

    @DataProvider(name = "jobs")
    public Object[][] createData() {
        return new Object[][]{
                {"Teller"},
                {"Banker"},
                {"QA analyst"},
        };
    }



    @Test(dataProvider = "jobs")
    public void testSearch(String dataJobsList) throws InterruptedException {
        SearchCareerElm searchJobs = PageFactory.initElements(driver,SearchCareerElm.class);
        searchJobs.navigateToSearch(dataJobsList);
        //searchJobs.fillTheSearch(dataJobsList);

    }
}
