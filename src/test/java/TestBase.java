import Browsermanager.BrowserManager;
import DriverManager.Drivermanager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orgAutomation.Util.Util;

public class TestBase {
public   WebDriver driver;
    @BeforeTest(alwaysRun = true,dependsOnGroups = {"sanity"})
    public void setUp()
    {
        BrowserManager.getInstance().setBrowser();
     driver= Drivermanager.getInstance().getDriver();
       driver.get(Util.getInstance().getBaseUril());
    }
    @AfterTest(alwaysRun = true)
    public void tearDown()
    {
        driver.quit();
    }


}
