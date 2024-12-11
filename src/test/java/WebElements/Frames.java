package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Frames {
    private static By browser= By.xpath("//span[contains(text(),'Browser')]//parent::a");
    private static By frame=By.xpath("//span[contains(text(),'Frame')]//parent::a");
    private static By btn=By.id("Click");
    public static void validate(WebDriver driver)
    {
        driver.findElement(browser).click();
        driver.findElement(frame).click();
        driver.switchTo().frame(2);
        driver.switchTo().frame(0);
      driver.findElement(btn).click();
      String txt=driver.findElement(btn).getText();
        Assert.assertEquals("Hurray! You Clicked Me.",txt,"frame button text validation failed");
    }
}
