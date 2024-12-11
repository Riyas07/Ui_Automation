import WebElements.windows;
import org.testng.annotations.Test;

public class Testcase4 extends TestBase{
    @Test
    public void validate_windows()
    {
        windows.validate(driver);
    }
}
