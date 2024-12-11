package Browsermanager;

import DriverManager.Drivermanager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import orgAutomation.Util.Util;

public class BrowserManager {
    private static BrowserManager browserManager;
    private BrowserManager()
    {

    }
    public static BrowserManager getInstance()
    {
        if (browserManager==null)
        {
             browserManager=new BrowserManager();
             return browserManager;
        }
        else
        {
            return  browserManager;
        }
    }
    public void setBrowser()
    {
       if (Util.getInstance().getBrowserName().equalsIgnoreCase("chrome"))
       {
           ChromeOptions options=new ChromeOptions();
           options.addArguments("--start-maximized");
           Drivermanager.getInstance().setWebdriver(new ChromeDriver(options));
       }
    }
}
