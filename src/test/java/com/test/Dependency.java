package com.test;

import org.testng.annotations.Test;


//HERE LETS SUPPOSE WE HAVE TEST OF createShipmemt(),trackshipment(),cancelShipmemt()
//SO HERE IF CREATESHIPMENT TEST METHOD PASS THEN ONLY tracknum GENRATE
//AND WITH THE HELP OF tracknum WE CAN TRACK THE SHIPMENT AND CANCEL THE SHIPMENT  
//MEANS cancelShipmemt AND trackshipment TEST METHODS DEPENDS ON createShipmemt
//SO FOR PROPER FLOW OF TEST METHOD EXECUTION WE USE DEPENDENCY CONCEPT
public class Dependency {

	static String tracknum=null;
                                                /* WHAT HAPPENED IF THE DEPENDENT TEST METHOD i.e createShipmemt() IS FAILED ? */
	@Test
	public void createShipmemt() {
		System.out.println(5/0);                // SO HERE I INTENTIONALLY FAILED THIS TEST METHOD SO ALL THE MEAIN METHODS SKIPPED 
		System.out.println("createShipment");   // BEACUSE OF DEPENDENCY CONCEPT
		tracknum= "abcy23k7";                   
	}

	@Test (dependsOnMethods = "createShipmemt")
	public void trackshipment() throws Exception {
		
		if(tracknum != null) {
			System.out.println("trackshipment");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}

	@Test (dependsOnMethods = "createShipmemt")
	public void cancelShipmemt() throws Exception {
		if(tracknum != null) {
			System.out.println("cancelShipmemt");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}
}
