package testcases.suiteb;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.TestDataProvider;

import org.testng.annotations.AfterMethod;

public class LoginTest_DataProvider {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void doLogin(String username, String password) {
		System.out.println(username +"----"+password);
		
	}
	
	//@DataProvider
	public Object[][] getData() {
		Object[][] data =  new Object[3][2];
		
		//1st row
		data[0][0]="U1";
		data[0][1]="P1";
		
		//2nd row
		data[1][0]="U2";
		data[1][1]="P2";
		
		//3rd row
		data[2][0]="U3";
		data[2][1]="P3";
		
		return data;
	}

}
