package pages;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utils.ThreadWait.threadWait;


public class HomePage {
    String newSearchInput = "//*[@class='_1w14zmh']//input";
    String staysButton = "//*[@id='Koan-via-SearchHeader__option-1']";
    String languageButton = "//span[@class=\"_cbqpv2\"]";
    String danskLanguageButton = "//a[@class='_11sziryv' and ./div[text()='Dansk']]";
    String currencyButton = "//div[@class=\"_lvb55za\" and ./span[contains(text(), 'currency')]]";
    String polishCurrency = "//button[@class='_11sziryv' and ./div[contains(text(), 'Polish')]]";

    private final Logger logger = LogManager.getRootLogger();

    public HomePage(){
       // BasicConfigurator.configure();
    }
    public void clickRestaurantsButton() {
        Driver.getDriver().findElement(By.xpath(newSearchInput)).sendKeys(Keys.RETURN);
        logger.info("Press enter on text field");
        threadWait();
        threadWait();
        threadWait();
    }

    public  ResultsPage  clickStayButton(){
        Driver.getDriver().findElement(By.xpath(staysButton)).click();
        logger.info("clicked to stays field");
        threadWait();
        return new ResultsPage();
    }

    public void clickTextFieldButton() {
        Driver.getDriver().findElement(By.xpath(newSearchInput)).click();
        logger.info("clicked text field");
        threadWait();
    }

    public void clickLanguageButton(){
        Driver.getDriver().findElement(By.xpath(languageButton)).click();
        logger.info("clicked language button");
        threadWait();
    }

    public void inputDestination(String searchQuery) {
        Driver.getDriver().findElement(By.xpath(newSearchInput)).sendKeys(searchQuery);
        logger.info("Press enter on text field");
        threadWait();
    }

    public void clickDanskLanguageButton(){
        Driver.getDriver().findElement(By.xpath(danskLanguageButton)).click();
        logger.info("Press Dansk language button");
        threadWait();
    }

    public void clickCurrencyButton(){
        Driver.getDriver().findElement(By.xpath(currencyButton)).click();
        logger.info("Press currency button");
        threadWait();
    }

    public void clickPolishCurrency(){
        Driver.getDriver().findElement(By.xpath(polishCurrency)).click();
        logger.info("Press polish currency button");
        threadWait();
    }

}
