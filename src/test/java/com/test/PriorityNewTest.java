package com.test;

import org.testng.annotations.Test;
 // What is Priority ? : priority is the Annotation inside the @Test annotation for example. @Test (priority =0).

public class PriorityNewTest {
	// FLIGHT BOOKING TEST
		@Test (priority =0)
	  public void SignUp() {
			System.out.println("SignUp");
			
	  }
		@Test (priority =1)
		  public void Login() {
				System.out.println("Login");
				
		  }
		@Test(priority =2)
		  public void ChekingForPrice() {
				System.out.println("ChekingForPrice");
				
		  }
		@Test(priority =3)
		  public void ChekingForFlight() {
				System.out.println("ChekingForFlight");
				
		  }
		@Test(priority =4)
		  public void BookTicket() {
				System.out.println("BookTicket");
				
		  }
	
		@Test(priority =5)
		  public void LogOut() {
				System.out.println("LogOut");
				
		  }
}
