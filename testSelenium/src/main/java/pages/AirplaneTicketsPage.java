package pages;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AirplaneTicketsPage {

    private final Logger logger = LogManager.getRootLogger();

    String title = "//*[@class=\"flights-common-search-form-treatment-b-CommonSearchForm__moduleTitle--3QB-I\"]";
    public String cityName;

    public AirplaneTicketsPage(String cityName){
        this.cityName = cityName;
    }

    public String getTitle() {
        String title = Driver.getDriver().findElement(By.xpath(this.title)).getText();
        logger.info("title for Airplanes Page");
        return title;
    }

}
