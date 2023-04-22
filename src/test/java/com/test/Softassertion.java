package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
              // URL AND TITLE ASSERTIONS ARE INTENTIONALY FAILED.
public class Softassertion {
	@SuppressWarnings("deprecation")
	@Test
	public void facebookLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		SoftAssert softassert = new SoftAssert();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("xyz", Keys.ENTER);
		
		// URL ASSERTION
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.facebook.com/login/3540";
		softassert.assertEquals(ActualUrl, ExpectedUrl, "Url is mismatched");

		// TEXt ASSERTION
		String Actualtext = driver.findElement(By.id("email")).getAttribute("value");
		String Expectedtext = "";
		softassert.assertEquals(Actualtext, Expectedtext, "TextBox is not Empty");

		// TITLE ASSERTION
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Logg in to Facebook";
		softassert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");

		// BORDER ASSERTION
		String ActualBorder = driver.findElement(By.id("email")).getCssValue("border");
		String ExpectedBorder = "1px solid rgb(240, 40, 73)";
		softassert.assertEquals(ActualBorder, ExpectedBorder, "border is mismatched");
		
		// Alert massage ASSERTION
		String ActualMessage = driver .findElement(By.xpath("//div[@id=\"email_container\"]//div[2]")).getText();
		String ExpectedMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softassert.assertEquals(ActualMessage, ExpectedMessage, "Alert message is mismatched");
		
		driver.quit();
		softassert.assertAll();

	}
}
