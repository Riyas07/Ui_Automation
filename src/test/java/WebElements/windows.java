package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class windows {
    private static By browser= By.xpath("//span[contains(text(),'Browser')]//parent::a");
    private static By window=By.xpath("//span[contains(text(),'Window')]//parent::a");
    private static By btn=By.xpath("//span[contains(text(),'Open with delay')]//parent::button");
    public static  void validate(WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(browser).click();
        driver.findElement(window).click();
        driver.findElement(btn).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        Assert.assertEquals(3,driver.getWindowHandles().size(),"window size mismatch");
    }
}
