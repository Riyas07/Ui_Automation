package orgAutomation.Util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Util {
    private static Util util;
    Properties properties;
    private Util()
    {
        properties=new Properties();
       try
       {
           InputStream inputStream=new FileInputStream("config.properties");
           properties.load(inputStream);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
    public static Util getInstance()
    {
        if (util==null)
        {
            util=new Util();
            return util;
        }
        else
        {
            return util;
        }
    }
    public String getBrowserName()
    {
        return properties.getProperty("browser");
    }
    public String getBaseUril()
    {
        return properties.getProperty("baseurl");
    }
}
