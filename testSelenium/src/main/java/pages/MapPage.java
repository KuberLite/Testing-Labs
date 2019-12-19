package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.ThreadWait.threadWait;

public class MapPage {

    String locationString = "//li[contains(@class, \"mapsv2-card mapsv2-listcard neighborhood mapsv2-cardcollapsed\")]";

    public MapPage(){}


    public void inputLocation() {
        Driver.getDriver().findElement(By.xpath(locationString)).click();
        threadWait();
    }
}
