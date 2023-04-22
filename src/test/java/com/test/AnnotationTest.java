package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

// FOR EXAMPLE PERPOSE ONLY. TO UNDERSTAND
public class AnnotationTest {
	@Test
	public void TEST() {
		System.out.println("TEST");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}


	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}
