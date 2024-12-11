package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    private static By browser= By.xpath("//span[contains(text(),'Browser')]//parent::a");
    private static By drag=By.xpath("//span[contains(text(),'Drag')]//parent::a");
    private static By dd1=By.xpath("//span[contains(text(),'Drag me around')]//parent::div");
    private static By target=By.xpath("//p[contains(text(),'Drop here')]//parent::div");
    private static By drop=By.xpath("//p[contains(text(),'Drag to target')]//parent::div");
    private static By dd2=By.xpath("//div[@class='card'][4]/table//tr[3]//span[1]");
    public static void validate(WebDriver driver)
    {
        driver.findElement(browser).click();
        driver.findElement(drag).click();
       WebElement dragdrop1= driver.findElement(dd1);
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(dragdrop1,300,0).release().perform();
      WebElement t=  driver.findElement(target);
      WebElement d=driver.findElement(drop);
        actions.dragAndDrop(d,t).release().build().perform();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,400)");
        WebElement ddd=driver.findElement(dd2);
        actions.dragAndDropBy(ddd,10,0).release().build().perform();
    }
}
