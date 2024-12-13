import WebElements.Textbox;
import org.testng.annotations.Test;

import java.awt.*;

public class Testcase6 extends TestBase{
    @Test
    public void validate_textbox()
    {
        Textbox.validate(driver);
    }
}
