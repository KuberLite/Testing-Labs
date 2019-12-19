package utils;

import driver.Driver;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {

    private final Logger logger = LogManager.getRootLogger();

    public void onTestFailure(ITestResult iTestResult) {
        logger.error("Test has ended up with a failure");
        saveScreenshot();}

    private void saveScreenshot() {

        File screenCapture = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenCapture, new File(".//target/screenshots/" + getCurrentTimeAsString() + ".png"));
        } catch (IOException e) {
        }
    }

    private String getCurrentTimeAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd_HH-mm-ss");
        return ZonedDateTime.now().format(formatter);
    }
}
