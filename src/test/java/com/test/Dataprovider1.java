package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	static WebDriver driver;

	@Test(dataProvider = "dp1")

	public void verifyLogin(String name) throws InterruptedException {
		System.out.println(name);
	}

	@Test(dataProvider = "dp2")
	public void verifyINT(Integer i) {
		System.out.println(i);
	}

	@Test(dataProvider = "dp3")
	public void Info(Object info) {
		System.out.println(info);
	}

	@Test(dataProvider = "dp4")
	public void loginData(Object s) {
		System.out.println(s);
	}

	@DataProvider()
	public String[] dp1() {
		String[] data = new String[] { "gopal", "namdev", "hari" };

		return data;

	}

	@DataProvider
	public Integer[] dp2() { // THIS IS INTEGER TYPE OF ARRRAY
		Integer[] data = new Integer[] { 1, 314, 55 };
		return data;
	}

	@DataProvider
	public Object[] dp3() { // THIS IS OBJECT TYPE OF ARRRAY IT CAN STORE ANY SETS OF DATA
		Object[] data = new Object[] { 1, 314, "sumit", 'a', 12.14, true };
		return data;
		// NOW FOR TWO DIMENSIONAL ARRAY AND HOW TO PARAMETERIZED IT INTO TEST METHOD
	}

	// NOW FOR TWO DIMENSIONAL ARRAY AND HOW TO PARAMETERIZED IT INTO TEST METHOD
	@DataProvider
	public Object[][] dp4() {
		Object[][] data = new Object[][] { { "Admin", "admin123" }, { "admin", "xyz" }, { "abc", "Admin" } };
		return data;
	}
}
