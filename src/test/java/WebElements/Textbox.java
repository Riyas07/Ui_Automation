package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import orgAutomation.Util.ExcelManager;

public class Textbox {
  private  static   By element=By.xpath("//span[contains(text(),'Element')]//parent::a");
  private static   By textbox=By.xpath("//span[contains(text(),'Text Box')]//parent::a");
   private static By txt=By.xpath("//form[@id='j_idt88']/div[1]//input");
    public static void validate(WebDriver driver)
    {
        driver.findElement(element).click();
        driver.findElement(textbox).click();
      for (String s: ExcelManager.getInstance().getdata())
      {
          driver.findElement(txt).sendKeys(s);
      }
    }
}
