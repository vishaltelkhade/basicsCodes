package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
  
 static WebDriver driver;

@SuppressWarnings("deprecation")
@Parameters({"Username","Password"})
@Test ()
 public static void LogInWithDiffCredentials(String username, String password) 
 {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
 }
 @Test
 public static void VerifyLogin() 
 {
	SoftAssert softassert = new SoftAssert();
	WebElement ele = driver.findElement(By.xpath("//img[@alt='profile picture']"));
	softassert.assertTrue(ele.isDisplayed(),"unable to login or you have entered wrong credentialas");
	driver.close();
	softassert.assertAll();
	
 }
}
