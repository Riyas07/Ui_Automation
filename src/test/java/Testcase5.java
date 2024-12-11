import WebElements.dragAndDrop;
import org.testng.annotations.Test;

public class Testcase5 extends TestBase{
    @Test
    public void validate_dragAndDrop()
    {
        dragAndDrop.validate(driver);
    }
}
