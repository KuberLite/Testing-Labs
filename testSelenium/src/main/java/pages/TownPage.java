package pages;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.DocFlavor;

import static utils.ThreadWait.threadWait;

public class TownPage {

    private final Logger logger = LogManager.getRootLogger();

    String placeName = "//*[@id=\"HEADING\"]";
    String closeButton = "//*[@class=\"brand-trip-search-geopill-TripSearchGeoPill__unscopeX--I6KUD\"]";


    public String name;

    public TownPage(String name){
        this.name = name;
    }

    public String getPlaceName() {
            String title = Driver.getDriver().findElement(By.xpath(placeName)).getText();
        logger.info("place name");
        return title;
    }

    public void closeButtonClick() {
        Driver.getDriver().findElement(By.xpath(closeButton)).click();
    }

}
