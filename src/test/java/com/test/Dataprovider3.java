package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider3 {
	static WebDriver driver;

	@Test(dataProvider = "dp4")

	public void verifyLogin(Object[] s) throws InterruptedException { // Object[] s BECAUSE MULTIDIMENSIONAL ARRAY IS A COMBINATION OF 
		                                                              // SINGLE DIMENSIONAL ARRAY
		//System.out.println(s);
		System.out.println(s[0] +"   "+ s[1]);                        // IT IS ANOTHER WAY TOW PRINT THE DATA
	}

	@Test(dataProvider = "dp5")

	public void verifyData(Object[] j) throws InterruptedException { 
		                                                              
		System.out.println(j);
		//Or for jaggged array i can read data like this aslo
		for (int i = 0; i < j.length; i++) {
			System.out.println(i);
		}
	}
	// NOW FOR TWO DIMENSIONAL ARRAY AND HOW TO PARAMETERIZED IT INTO TEST METHOD
	//NORMAL MULTI DIMENSIONAL ARRAY
	@DataProvider
	public Object[][] dp4() {
		Object[][] data = new Object[][] { { "Admin", "admin123" }, { "admin", "xyz" }, { "abc", "Admin" } };
		return data;
	}
	
	//JAGGED MULTI DIMENSIONAL ARRAY----IN IT ROW SIZE IS FIXED BUT COL SIZE IS NOT FIXED
	@DataProvider
	public Object[][]dp5(){
		Object[][] data = new Object[][] {
			{"SUMIT","akhiles","xyz","","gopal"},
			{25,"admin123"},
			{"mahadeo",'A',356,"jagan"},
			{"dhiru","manu","shubh"}
			
		};
		return data;	
	}
	// NOW ITERATOR WE CAN USE BUT I DONT ABOUT COLLECTIONS
	
}
