package com.test;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
                                       //AssertDemo[ HardAssert ]
public class OrangeHRmAssertTest {
	WebDriver driver;

	@Test        // failed 
	public void verifyTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String Expectedtitle = "Log in to Facebook";
		String ActualTitle = driver.getTitle();
		assertEquals(Expectedtitle, ActualTitle, "Title is mismatched");
		Thread.sleep(2000);
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Test    //Passed
	public void verifyLogIn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Boolean actual = driver.findElement(By.xpath("//div[@class=\"oxd-table-filter\"]")).isDisplayed();
		Boolean expected = driver.findElement(By.xpath("//div[@class=\"oxd-table-filter\"]")).isDisplayed();
		assertEquals(actual, expected, "not correct page navigation");
		Thread.sleep(2000);
		driver.quit();
	}
}
