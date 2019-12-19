package pages;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

import static utils.ThreadWait.threadWait;

public class ResultsPage {

    private final Logger logger = LogManager.getRootLogger();

    String priceButton = "//*[@id='menuItemButton-price_range']/button/span[1]/div";
    String maxPage = "//*[@id = 'price_filter_max']";
    String saveButton = "//*[@class='_mrw4go7']";
    String typeOfPlaceButton = "//button[@class=\"_1o8pdwg\" and .//span[contains(text(), 'Type')]]";
    String privateRoomCheckBox = "//span[@class=\"_foa2bi\" and ./input[@name='Private room']]";
    String saveFiler = "//button[@class='_mrw4go7']";

    public void maxPageClick(){
        Driver.getDriver().findElement(By.xpath(maxPage)).click();
        logger.info("clicked max page field");
        threadWait();
    }

    public void priceButtonClick(){
        Driver.getDriver().findElement(By.xpath(priceButton)).click();
        logger.info("clicked price button");
        threadWait();
    }

    public void sendBackSpaceToPriceField(){
        Driver.getDriver().findElement(By.xpath(maxPage)).sendKeys(Keys.BACK_SPACE);
        logger.info("clicked back space keys");
        threadWait();
    }

    public void  sendValueToPriceField(){
        Driver.getDriver().findElement(By.xpath(maxPage)).sendKeys("567");
        logger.info("Inputted 567 to price field");
        threadWait();
    }

    public void clickSavePriceButton(){
        Driver.getDriver().findElement(By.xpath(saveButton)).click();
        logger.info("Saved price");
        threadWait();
    }

    public void clickTypeOfPlaceButton(){
        Driver.getDriver().findElement(By.xpath(typeOfPlaceButton)).click();
        logger.info("Clicked type of place button");
        threadWait();
    }

    public void checkedPrivateRoom(){
        Driver.getDriver().findElement(By.xpath(privateRoomCheckBox)).click();
        logger.info("Checked private room");
        threadWait();
    }

    public void saveFilterClick(){
        Driver.getDriver().findElement(By.xpath(saveFiler)).click();
        logger.info("Saved filter");
        threadWait();
    }
}
