package groupTest;

import org.testng.annotations.Test;
@Test(groups = {"All"})      // THIS IS CALLED PARTIAL GROUP..IF WE DEFINE GROUP AT CLASS LEVEL THEN IT IS CALLED AS PARTIAL GROUP
public class GroupTest2 {                                  //windows.regression,windows.sanity,windows.smoke ARE FOR TO KNOW WHAT IS REGULAR EXPRESSION 
	@Test(groups = {"sanity","smoke"})                     // THERE ARE SO MANY REGULAR EXPRESSION BUT I KNOW ONLY THIS
	public void Test7() {
		System.out.println("Test7");
	}

	@Test(groups = {"sanity","regression","windows.smoke"})
	public void Test8() {
		System.out.println("Test8");
	}

	@Test(groups = {"regression","functional"})
	public void Test9() {
		System.out.println("Test9");
	}

	@Test    // EVEN I CANNOT DEFINE ANY GROUP TO THIS METHOD STILL IT EXECUTE BECAUSE I DEFINE GROUPING AT CLASS LEVEL
	public void Test10() {
		System.out.println("Test10");
	}

	@Test(groups = {"functional","windows.regression"})
	public void Test11() {
		System.out.println("Test11");
	}

	@Test(groups = {"sanity","smoke","windows.sanity"})
	public void Test12() {
		System.out.println("Test12");
	}
}
