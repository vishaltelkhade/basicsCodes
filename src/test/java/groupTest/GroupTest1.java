package groupTest;

import org.testng.annotations.Test;

public class GroupTest1 {
	@Test(groups = {"sanity","smoke"})
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(groups = {"sanity"})
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(groups = {"sanity","smoke","regression"})
	public void Test3() {
		System.out.println("Test3");
	}

	@Test(groups = {"functional","smoke"})
	public void Test4() {
		System.out.println("Test4");
	}

	@Test(groups = {"sanity","smoke","functional"})
	public void Test5() {
		System.out.println("Test5");
	}

	@Test
	public void Test6() {
		System.out.println("Test6");
	}
}
