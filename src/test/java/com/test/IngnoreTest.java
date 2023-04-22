
package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore   //IGNORED AT CLASS LEVEL
public class IngnoreTest {
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Ignore //HERE THE HIGHEST PRESIDENCE HAS TO INGNORE ANNOTATION
	@Test (enabled = true)
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Ignore
	@Test
	public void test4() {
		System.out.println("test4");
	}
	@Ignore
	@Test
	public void test5() {
		System.out.println("test5");
	}
}
