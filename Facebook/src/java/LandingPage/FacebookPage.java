package LandingPage;
import methods.CommonMethods;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Unaer on 1/18/2017.
 */
public class FacebookPage extends CommonMethods{
    @FindBy(how = How.XPATH, using = "html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/*")
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

      public void login(String username, String password){

          typeUsername(username);
          typePassword(password);
          clickLogin();
      }

      @FindBy(how = How.XPATH, using = "htlm/body/div[1]/div[2]/div[3]/div/div/div")
    public WebElement errorStuff;

      public void assertIncorrect(String condition) {
          if (condition.equals("WrongUsername")) {
              Assert.assertTrue(errorStuff.getText().contains("Incorrect Email"));
          } else if (condition.equals("WrongPassword")) {
              Assert.assertTrue(errorStuff.getText().contains("Incorrect Password"));
          }


      }
          @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div[1]/ul/li/div/div/a")
          public WebElement homepageFullName;

    public void assertSuccessfulLogin(){
        Assert.assertTrue(homepageFullName.getText().equals(FacebookFullName));
    }


    }



