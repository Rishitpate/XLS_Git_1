package testcases.suitea;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	
	@Test
	public void doLogin() {
		String expectedResult = "ABCX";
		String actualResult = "ABC";
		
		//Assert.assertEquals(actualResult, expectedResult);
		//Assert.assertTrue(5>12, "Error Message");
		System.out.println("Start");
		Assert.fail("Custom Err Message - 404 error"); //Will fail the test case without question//stops execution from this line
		System.out.println("End");
	}

}
