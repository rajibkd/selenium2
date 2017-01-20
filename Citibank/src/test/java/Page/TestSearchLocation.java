package Page;

import Base.CommonAPI;
import hpElements.LocationElmn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ahoura on 1/19/17.
 */
public class TestSearchLocation extends CommonAPI {
    @Test
    public void locationTest() throws InterruptedException, IOException {
        LocationElmn locEl = PageFactory.initElements(driver,LocationElmn.class);
        locEl.searchButton("VA 22102");
        takeScreenShot();
    }

}
