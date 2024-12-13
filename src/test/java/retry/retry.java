package retry;

import DriverManager.Drivermanager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.io.File;

public class retry implements IRetryAnalyzer {
    int limit=3;
   static int count=0;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if (!(iTestResult.isSuccess()))
        {
            if(count<limit){
                TakesScreenshot screenshot=(TakesScreenshot) Drivermanager.getInstance().getDriver();
              File from =  screenshot.getScreenshotAs(OutputType.FILE);
              File to =new File("Screenshot/img.png");
                try {
                    FileHandler.copy(from,to);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                count++;
                return true;
            }
        }
        return false;
    }
}
