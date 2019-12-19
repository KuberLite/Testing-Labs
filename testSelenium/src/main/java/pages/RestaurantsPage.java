package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.ThreadWait.threadWait;

public class RestaurantsPage {

    String selectTown = "//descendant::div[@class=\"geos_row\"][1]//descendant::div[@class=\"geo_wrap\"][1]";
    String test = "div[@class=\"ui_input_checkbox filterItem lhrFilter filter Cuisine cuisine Cuisine_10659 index_0 alwaysShowItem\"]";
    String additionalInfo = "//descendant::div[@class=\"prw_rup prw_restaurants_restaurant_filters\"][3]//div[@class=\"ui_input_checkbox filterItem lhrFilter filter Cuisine cuisine Cuisine_5473 index_0 alwaysShowItem\"]";
    String moreButton = "//descendant::div[@class=\"prw_rup prw_restaurants_restaurant_filters\"][3]//div[@class=\"filterAddOn\"]";
    String mealsButton = "//div[@class=\"group dish \"]";
    String particularMeal = "//descendant::div[@class=\"filtersCol\"][3]//descendant::div[@class=\"filterItem filter ui_input_checkbox\"]";
    String confirmButton = "//div[@class=\"applyButton ui_button primary\"]";
    String map = "//div[@class=\"expandMap ui_icon map-pin-fill\"]";
    public RestaurantsPage(){}

    public void selectTown() {
        Driver.getDriver().findElement(By.xpath(selectTown)).click();
        threadWait();
    }

    public void clickMoreButton() {
        Driver.getDriver().findElement(By.xpath(moreButton)).click();
        threadWait();
    }

    public MapPage openMap() {
        Driver.getDriver().findElement(By.xpath(map)).click();
        threadWait();
        return new MapPage();
    }

    public void confirmButtonClick() {
        Driver.getDriver().findElement(By.xpath(confirmButton)).click();
        threadWait();
    }

    public void selectMeal() {
        Driver.getDriver().findElement(By.xpath(particularMeal)).click();
        threadWait();
    }

    public void clickMealsButton() {
        Driver.getDriver().findElement(By.xpath(mealsButton)).click();
        threadWait();
    }

    public void selectAdditionalInfo() {
        Driver.getDriver().findElement(By.xpath(additionalInfo)).click();
        threadWait();
    }



}
