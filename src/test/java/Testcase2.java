import WebElements.Alerts;
import org.testng.annotations.Test;

public class Testcase2 extends TestBase{
    @Test(priority = 1)
    public void validate_alert()
    {
        Alerts.validate(driver);
    }
}
