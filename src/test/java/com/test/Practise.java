package com.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {
static WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jiocinema.com/");
        driver.findElement(By.xpath("/html/body/app-root/app-header/nav/ul/li[2]/a")).click();
        WebElement ele = driver.findElement(By.xpath("/html/body/app-root/section/app-home/div/div[2]/app-carousel/jio-slidercarousel//div[1]/div"));
	    assertFalse(ele.isDisplayed());
	    driver.quit();
	}
	
	
}

