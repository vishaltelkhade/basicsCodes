package com.test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class EnableDisableTest {
	WebDriver driver;

	@Parameters("URL")
	@Test
	public void launchUrl(String URL) {
		driver.get(URL);
	}

	@Parameters({ "username", "password" })
	@SuppressWarnings("deprecation")
	@Test
	public void VerifyLogIn(String username, String password) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		WebElement element = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
		assertTrue(element.isDisplayed());
	}

	@Test
	public void NavigateToInfo() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
	}

	@Test
	public void VerfyInfo() {
		WebElement element = driver.findElement(By.xpath("//div[@class=\"orangehrm-background-container\"]"));
		assertTrue(element.isDisplayed());
	}

	@Parameters("browserName")
	@BeforeTest
	public void LaunchApp(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			default :
				System.err.println("invalid browserName");
			
		}
		driver.manage().window().maximize();
	}

	@Parameters("sleepTime")
	@AfterTest
	public void Teardown(Long sleepTime) throws InterruptedException {
		Thread.sleep(sleepTime);
		driver.quit();
	}

}
