package HomePage;
import Base.CommonAPI;
import Methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Unaer on 1/27/2017.
 */
public class FacebookHomePage extends CommonMethods{
 @FindBy(how = How.XPATH,using = ".//*[@id='u_c_1']/div/div[1]/em")
 public WebElement headingSettings;
    @FindBy(how = How.XPATH,using = ".//*[@id='u_g_0']")
      public WebElement headingCreateGroup;

    @FindBy(id = "u_0_1")
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_3']")
    public WebElement lastName;
    @FindBy (how = How.XPATH, using=".//*[@id='u_0_6']")
    public WebElement mobileNumber;
    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_9']")
    public WebElement renterMobile;
    @FindBy(how = How.XPATH, using =".//*[@id='u_0_b']")
    public WebElement createPassword;



    //birth date drop box
    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_3']")
    public WebElement Month;
    @FindBy (how = How.XPATH, using=".//*[@id='u_0_6']")
    public WebElement Day;
    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_9']")
    public WebElement Year;


}
