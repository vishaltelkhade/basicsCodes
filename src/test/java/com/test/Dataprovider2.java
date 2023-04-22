package com.test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider2 {
	static WebDriver driver;
	
	// WITHOUT DATAPROVIDER NAME

	@SuppressWarnings("deprecation")
	@Test(dataProvider = "signupData1") // we can use method name "signupData1" as dataprovider name if name is not mentioned

	public void verifyLogin(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]"));
		assertTrue(ele.isDisplayed(), "invalid credentials");
		Thread.sleep(3000);
		driver.quit();

	}

	@DataProvider()    // or if here data provider name is not mentioned we can use @DataProvider methods name as a name to the @Test method
	public Object signupData1() {
		Object[][] data = new Object[2][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] ="xyz";
		return data;

	}
}
