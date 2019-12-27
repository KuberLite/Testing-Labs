
import driver.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.TestListener;

@Listeners({TestListener.class})
public class TripAdvisorTest {

    private static final int WAIT_SECONDS_TO_LOAD = 10;

    private HomePage homePage;
    private MapPage mapPage;
    private RestaurantsPage restaurantsPage;
    private ResultsPage resultsPage;
    private AirplaneTicketsPage airplaneTicketsPage;
    private TownPage townPage;

    @BeforeTest

    public void before() {
        homePage = new HomePage();
        Driver.maximizeWindow();
        Driver.getDriver().get("https://www.airbnb.com/s/all");
    }

    @AfterTest
    public void after() {
        Driver.getDriver().close();
    }

    @Test
    public void search() throws InterruptedException {
        String searchQuery = "Mosk";
        homePage.inputDestination(searchQuery);
        homePage.clickRestaurantsButton();
    }

//     @Test
//     public void filterByParams() throws InterruptedException {
//         String searchQuery = "Moscow";
//         homePage.inputDestination(searchQuery);
//         homePage.clickRestaurantsButton();
//         homePage.clickTextFieldButton();
//         resultsPage = homePage.clickStayButton();
//         resultsPage.priceButtonClick();
//         resultsPage.maxPageClick();
//         resultsPage.sendBackSpaceToPriceField();
//         resultsPage.sendBackSpaceToPriceField();
//         resultsPage.sendBackSpaceToPriceField();
//         resultsPage.sendBackSpaceToPriceField();
//         resultsPage.sendBackSpaceToPriceField();
//         resultsPage.sendValueToPriceField();
//         resultsPage.clickSavePriceButton();
//     }

    @Test
    public void twoCityToOneSearch() {
        String searchQuery = "Moscow Paris";
        homePage.inputDestination(searchQuery);
        homePage.clickRestaurantsButton();
    }

    @Test
    public void changeLanguage(){
        homePage.clickLanguageButton();
        homePage.clickDanskLanguageButton();
    }

    @Test
    public void changeCurrency(){
        homePage.clickCurrencyButton();
        homePage.clickPolishCurrency();
    }

    @Test
    public void filterTypeOfPlace(){
        String searchQuery = "Moscow";
        homePage.inputDestination(searchQuery);
        homePage.clickRestaurantsButton();
        homePage.clickTextFieldButton();
        resultsPage = homePage.clickStayButton();
        resultsPage.clickTypeOfPlaceButton();
        resultsPage.checkedPrivateRoom();
        resultsPage.saveFilterClick();
    }
}
