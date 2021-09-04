package testcases.suiteb;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {
	
	boolean flag = false; //read from xls, json
	@Test (priority = 1)
	public void search(ITestContext context) {
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching phone");
		
		//Output is phone name, we want to use in the selectPhone Method
		context.setAttribute("phoneName", "iphone"); //setting attributes of context
	}

	@Test (priority = 2, dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		
		String name = (String)context.getAttribute("phoneName");
		
		System.out.println("Selecting Phone: "+name);
		//Assert.fail();
		//generates a id tag required for checkout
		context.setAttribute("idTag", "6665854");
	}
	
	@Test (priority = 3, dependsOnMethods = {"search", "selectPhone"})
	public void checkout(ITestContext context) {
		System.out.println("Checking out");
		
		//requires phoneName and id tag
		System.out.println("Checkout requires: "+context.getAttribute("phoneName")+" and idTag which is:  "+context.getAttribute("idTag"));
	}
}
