package com.test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotaition2 {
	WebDriver driver;
	
	@BeforeTest
	public void launchChromebrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void Teardown() {
		driver.quit();
	}
	@Test(priority = 0)
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void EnterLoginInfo() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@Test(priority = 2)
	public void verifylogin() {
	driver.findElement(By.xpath("//div[@class=\"oxd-table-filter\"]")).isDisplayed();	
	
	}
	@Test(priority = 3)
	public void NavigateToInfo() {
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}
	@Test(priority = 4)
	public void VerifyMyInfo() {
		driver.findElement(By.xpath("//div[@class=\"oxd-layout-context\"]")).isDisplayed();
	}
	

}
