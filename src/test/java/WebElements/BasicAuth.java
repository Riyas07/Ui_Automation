package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuth{
  private static By home=  By.xpath("//span[contains(text(),'Home')]//parent::a");
 private static By auth=By.xpath("//span[contains(text(),'Auth')]//parent::a");
  public static void validate(WebDriver driver)
  {
      driver.findElement(home).click();
      driver.findElement(auth).click();
      driver.get("http://admin:testleaf@leafground.com:8090/login");
  }
}
