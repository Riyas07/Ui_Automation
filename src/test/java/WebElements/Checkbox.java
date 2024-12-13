package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Checkbox {
    private static By element=By.xpath("//span[contains(text(),'Element')]//parent::a");
    private static By checkbox=By.xpath("//span[contains(text(),'Check Box')]//parent::a");
   private  static By toggle=By.xpath("//form[@id='j_idt87']/div/div[2]//div[@class='card'][1]/div/div[2]");
   private static By msg=By.xpath("//div[@id='j_idt111']//following-sibling::div[3]/div/div/div[2]/span");
    public static void validate(WebDriver driver)
    {
        driver.findElement(element).click();
        driver.findElement(checkbox).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement tgl= wait.until(ExpectedConditions.visibilityOfElementLocated(toggle));
      tgl.click();
     String m= wait.until(ExpectedConditions.visibilityOfElementLocated(msg)).getText();
        Assert.assertEquals("Checked",m,"toggle msg validation failed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(msg));
        wait.until(ExpectedConditions.elementToBeClickable(toggle)).click();
        String m1= wait.until(ExpectedConditions.visibilityOfElementLocated(msg)).getText();
        Assert.assertEquals("Unchecked",m1,"toggle msg1    validation failed");
    }
}
