
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AgodaTest {

	private static final int WAIT_SECONDS_TO_LOAD = 10;

	private WebDriver driver;

	@BeforeTest
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void after() {
		driver.close();
	}

	@Test
	public void checkingRecommendations() throws InterruptedException {
		driver.get("https://www.tripadvisor.ru/?fid=e0febdb3-f0bb-4f73-a9ae-c7c560d75118");
		Thread.sleep(1000);
		//
		WebDriverWait wait = new WebDriverWait(driver, 100);
        //driver.findElement(By.xpath("//*[@id=\"component_15\"]/div/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div")).click();//.sendKeys("Minsk");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[4]/div/div[1]")).click();//.sendKeys("Minsk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div/a[1]/div/div/div")).click();
		Thread.sleep(3000);
	}



}
