package com.test;

import org.testng.annotations.Test;
public class Dependency3 {
	static String tracknum=null;

	// SO IN THIS SCENARIO I FAILED DEPENDENT METHOD WHICH DEPENDS ON ANOTHER DEPENDENT METHOD i.e trackshipment()
	// SO HERE createShipmemt()IS PASSED AND BECAUSE OF trackshipment() FAILURE cancelShipmemt() IS SKIPPED BECAUSE IT IS DEPEND ON
	// createShipmemt() ALONG WITH trackshipment()
	
	@Test
	public void createShipmemt() {
		//System.out.println(5/0);                // SO HERE I INTENTIONALLY FAILED THIS TEST METHOD AND ALSO WE USE alwaysRun = true
		System.out.println("createShipment");     // BEACUSE OF THAT BOTH MAIN METHOD WILL EXECUTE
		tracknum= "abcy23k7";                     // YOU CAN SEE IN THE CONSOLE TEST RUN IS 3 MEANS NO ANY METHOD SKIPPED
	}

	@Test (dependsOnMethods = "createShipmemt")
	public void trackshipment() throws Exception {
		System.out.println(5/0);
		if(tracknum != null) {
			System.out.println("trackshipment");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}

	@Test (dependsOnMethods = {"createShipmemt","trackshipment"})
	public void cancelShipmemt() throws Exception {
		if(tracknum != null) {
			System.out.println("cancelShipmemt");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}
}
