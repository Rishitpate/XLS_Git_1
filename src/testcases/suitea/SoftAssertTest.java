package testcases.suitea;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void validate() {
		SoftAssert sf = new SoftAssert();
		sf.assertEquals("ABC", "ABC");
		sf.assertEquals("abc", "xyz");//Fail
		sf.assertTrue(5>11, "Not Mathematically possible");//Fail
		System.out.println("Checking if softassert works");
		sf.fail("404-Error");//Fail
		sf.assertAll();
		
		
	}

}
