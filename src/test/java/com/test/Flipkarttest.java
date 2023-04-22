package com.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



// index bound exception problem.
public class Flipkarttest {

	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		driver.close();
	}

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_331-kn _2tvxW']"));
		List<String> list = null;

		for (int i = 0; i <= ele.size(); i++) 
		{
			String productName = ele.get(i).getText();
			list = new ArrayList<String>();
			list.add(productName);
			System.out.println(productName);
		}
	}
}
