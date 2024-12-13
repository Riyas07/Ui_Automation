import WebElements.Alerts;
import WebElements.BasicAuth;
import org.testng.annotations.Test;

public class Testcase1 extends TestBase{
    @Test(priority = 1 ,groups = "sanity")
    public void validate_baseAuth()
    {
        BasicAuth.validate(driver);
    }

}
