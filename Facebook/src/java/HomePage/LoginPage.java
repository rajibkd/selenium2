package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Unaer on 1/27/2017.
 */
public class LoginPage extends CommonAPI {
    @FindBy(how = How.XPATH, using="html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/*")
    List<WebElement> elements = new ArrayList<WebElement>();



    public void typeUsername(String username){
        elements.get(0).sendKeys(username);

    }

    public void typePassword(String password){
        elements.get(1).sendKeys(password);
    }

    public void clickLogin(){
        elements.get(2).click();
    }

    public void login_facebook(String username, String password){
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }
}
