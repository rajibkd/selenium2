package ui;

import Methods.CignaCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 2/12/17.
 */
public class GlobalHeader extends CignaCommon {
    @FindBy(how = How.CSS, using = ".personal")
    public static WebElement btnPersonal;
    @FindBy(how = How.CSS, using = ".business")
    public static WebElement btnBusiness;
    @FindBy(how = How.CSS, using = ".health-care-professionals")
    public static WebElement btnHCProffesionals;
    @FindBy(how = How.CSS, using = ".international")
    public static WebElement btnInternational;

    public void getPersonal()throws InterruptedException{
        btnPersonal.click(); sleepFor(1);
    }
    public void getBusiness()throws InterruptedException {
        btnBusiness.click(); sleepFor(1);
    }
    public void getHCProffesionals() throws InterruptedException {
        btnHCProffesionals.click(); sleepFor(1);
    }
    public void getInterbational() throws InterruptedException{
    btnInternational.click(); sleepFor(1);

    }
}
