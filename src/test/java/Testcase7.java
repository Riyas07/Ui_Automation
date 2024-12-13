import WebElements.Checkbox;
import org.testng.annotations.Test;

public class Testcase7 extends TestBase{
    @Test
    public void valiidate_checkbox()
    {
        Checkbox.validate(driver);
    }
}
