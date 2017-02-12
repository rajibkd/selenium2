package SearchItems;

import org.testng.annotations.Test;
import ui.DropDownMenuPage;
import java.util.List;



/**
 * Created by Rajib on 1/11/2017.
 */
public class DropDownMenuSearch extends DropDownMenuPage{
    @Test
    public void dropDownMenu()throws InterruptedException {
        List<String> text = getMenus();
        typeOnInputSearch(text);
    }
}
