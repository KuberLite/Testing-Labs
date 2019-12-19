package driver;

import browserFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import utils.PropertiesFile;

public class Driver {

    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getDriver(){
        if(driver ==null){
            driver = BrowserFactory.getBrowser(PropertiesFile.getProperty("browser"));
        }
        return driver;
    }

    public static void maximizeWindow() {
        Driver.getDriver().manage().window().maximize();
    }
}
