package com.test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class OptionalParameterAnnotaion2 {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void launchChromebrowser(@Optional("edge") String BrowserName) {// OPTIONAL PARAMETER CONCEPT

		switch (BrowserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("browserName is invalid");
		}
		driver.manage().window().maximize();
	}

	@Parameters("sleeptime")
	@AfterTest
	public void Teardown(Long sleeptime) throws Exception {
		System.out.println(sleeptime);
		Thread.sleep(sleeptime);
		driver.quit();
	}

	@Parameters("url")
	@Test(priority = 0)
	public void launchApp(String url) {
		driver.get(url);
	}

	@Parameters({ "username", "password" })
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void EnterLoginInfo(String username, String password) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Test(priority = 2)
	public void verifylogin() {
		WebElement element = driver.findElement(By.xpath("//div[@class=\"oxd-table-filter\"]"));
		assertTrue(element.isDisplayed());

	}

	@Test(priority = 3)
	public void NavigateToInfo() {

		driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}

	@Test(priority = 4)
	public void VerifyMyInfo() {
		WebElement elment = driver.findElement(By.xpath("//div[@class=\"oxd-layout-context\"]"));
		assertTrue(elment.isDisplayed());
	}

}
