package testcases.suiteb;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method - runs before every @Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method - runs after every @Test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class - runs before the class it is invoked");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class - runs after the class it is invoked");
  }

  @BeforeTest
  public void beforeTest() {
	  //open browser
	  //get some data
	  System.out.println("Before Test - runs once and before the whole test, before all the executed classes");
  }

  @AfterTest
  public void afterTest() {
	  //close browser
	  System.out.println("After Test - runs once and after the whole test, after all the executed classes");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite - runs once and before the whole suite, before everything");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite - runs once and after the whole suite, after everything");
  }

  @Test
  public void test1() {
	  System.out.println("test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("test 2");
  }
  
  @Test
  public void test3() {
	  System.out.println("test 3");
  }
  
}
