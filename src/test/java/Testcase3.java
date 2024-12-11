import WebElements.Frames;
import org.testng.annotations.Test;

public class Testcase3 extends TestBase{
    @Test
    public void validate_frame()
    {
        Frames.validate(driver);
    }
}
