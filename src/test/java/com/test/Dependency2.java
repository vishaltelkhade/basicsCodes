package com.test;

import org.testng.annotations.Test;
public class Dependency2 {
// IF I WANT TO EXECUTE MAIN METHODS EVEN THE DEPENDENT TEST METHOD FAILED i.e createShipmemt(),SO FOR THAT WE HAVE A PARAMETER  
// INSIDE THE TEST ANNOTATION CALLED alwaysRun= true
	static String tracknum=null;

	@Test
	public void createShipmemt() {
		System.out.println(5/0);                // SO HERE I INTENTIONALLY FAILED THIS TEST METHOD AND ALSO WE USE alwaysRun = true
		System.out.println("createShipment");   // BEACUSE OF THAT BOTH MAIN METHOD WILL EXECUTE
		tracknum= "abcy23k7";                   /// YOU CAN SEE IN THE CONSOLE TEST METHOD SKIPPED IS 0
	}

	@Test (dependsOnMethods = "createShipmemt", alwaysRun = true)
	public void trackshipment() throws Exception {
		
		if(tracknum != null) {
			System.out.println("trackshipment");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}

	@Test (dependsOnMethods = "createShipmemt", alwaysRun = true)
	public void cancelShipmemt() throws Exception {
		if(tracknum != null) {
			System.out.println("cancelShipmemt");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}
}
