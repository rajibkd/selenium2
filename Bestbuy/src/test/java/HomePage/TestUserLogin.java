package HomePage;

import PageFactory.CommonMethods;
import org.testng.annotations.Test;


public class TestUserLogin extends CommonMethods{

    @Test
    public void testUserLogin() throws InterruptedException{
        closeMailingListOption();
        userLogin();
    }
}