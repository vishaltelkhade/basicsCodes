package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
     static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		    ChromeOptions chroOP = new ChromeOptions();
		    chroOP.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver(chroOP);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
			//driver.findElement(By.xpath("//*[@id=\"sobe_d_b_1-carousel-viewport-container\"]/div[1]/button[2]")).click();
	Thread.sleep(5000);
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id=\"nav-subnav\"]"));
	 
	 for (int i = 0; i < ele.size(); i++) {
		 System.out.println(ele.get(i).getText());
	}
	 
	 

	}
	

	
}


