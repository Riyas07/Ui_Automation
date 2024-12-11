package WebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {
    private static By browser= By.xpath("//span[contains(text(),'Browser')]//parent::a");
    private static By alert=By.xpath("//span[contains(text(),'Alert')]//parent::a");
    private static By alert1=By.xpath("//span[contains(text(),'Show')]//parent::button");
    private static By msg=By.id("simple_result");
    public static void validate(WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(browser).click();
        driver.findElement(alert).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(alert1)).click();
       Alert a= driver.switchTo().alert();
        a.accept();
     WebElement mssg= wait.until(ExpectedConditions.visibilityOfElementLocated(msg));
        Assert.assertEquals("You have successfully clicked an alert",mssg.getText(),"Alert msg validation failed");
    }
}
