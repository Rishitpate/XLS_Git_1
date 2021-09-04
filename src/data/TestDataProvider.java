package data;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider
	public static Object[][] getData(Method m) {
		System.out.println(m.getName());
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
