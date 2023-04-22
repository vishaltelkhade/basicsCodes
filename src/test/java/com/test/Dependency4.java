package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class Dependency4 {
	
	// WHAT HAPPENED IF THE DEPENDENT METHOD IS SKIPPPED/INGNORED/DELETED
	// LETS TO KNOW WHAT HAPPENED WE PUT INGNORE ANNOTATION ON THE DEPENDENT TEST METHOD , MEANS IT MIGHT BE 
	// DELETED/SKIPPED/IGNORED
	 
	// ans IS IT WILL THROWN THE EXCPETION
	// BUT STILL WE WANT EXCUTE MAIN METHODS EVEN IF THE DEPENDENT METHOD IS SKIPPPED/INGNORED/DELETED 
	// ans IS USE PARAMETER INSIDE THE
	// TEST ANNOTATION CALLED ingnoreMissingDependency = true
	
	static String tracknum=null;
	@Ignore
	@Test
	public void createShipmemt() {
		//System.out.println(5/0);             
		System.out.println("createShipment");     
		tracknum= "abcy23k7";                     
	}

	@Test (dependsOnMethods = "createShipmemt", ignoreMissingDependencies = true)
	public void trackshipment() throws Exception {
		if(tracknum != null) {
			System.out.println("trackshipment");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}

	@Test (dependsOnMethods = {"createShipmemt"}, ignoreMissingDependencies = true)
	public void cancelShipmemt() throws Exception {
		if(tracknum != null) {
			System.out.println("cancelShipmemt");
		}
		else {
			throw new Exception("invalid trcking number");
		}
	}
}
