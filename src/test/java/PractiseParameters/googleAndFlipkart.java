package PractiseParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleAndFlipkart {
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	@BeforeTest
	@Parameters("browsername")
	public void LauchApp(String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "fiorefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("you entered mismatched browser name");
			break;
		}
		driver.manage().window().maximize();
	}

	@AfterTest
	@Parameters("sleeptime")
	public void tearDown(Long sleeptime) throws InterruptedException {
		System.out.println(sleeptime);
		Thread.sleep(sleeptime);
		driver.quit();
	}

	@Test
	@Parameters("Url")
	public void Enterurl(String Url) {
		driver.get(Url);
	}

	@Test 
	public void VerifyTitle() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("idli", Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[2]"));
		Thread.sleep(3000);
		softassert.assertTrue(ele.isDisplayed());
		softassert.assertAll();

	}

	@Test 
	public void VerifyWikititle() {
		 String actualtitle = driver.getTitle();
		 String ExpectedTitle = "Idli - Wikipedia";
	    softassert.assertEquals(actualtitle, ExpectedTitle);
	    softassert.assertAll();
	}
}
