package DriverManager;

import org.openqa.selenium.WebDriver;

public class Drivermanager {
    private static Drivermanager drivermanager;
    private ThreadLocal<WebDriver> webdriver=new ThreadLocal<>();
    public static Drivermanager getInstance()
    {
        if (drivermanager==null)
        {
            drivermanager=new Drivermanager();
            return drivermanager;
        }
        else
        {
            return drivermanager;
        }
    }
    public void setWebdriver(WebDriver driver)
    {
        this.webdriver.set(driver);
    }
    public WebDriver getDriver()
    {
       return this.webdriver.get();
    }
}
