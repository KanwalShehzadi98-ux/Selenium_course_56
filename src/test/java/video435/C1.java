package video435;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test()
	void method_1() {
		System.out.println("This is method 1");
	}
	
	@Test()
	void method_2() {
		System.out.println("This is method 2");
	}
	
	@BeforeMethod
	void before_method() {
		System.out.println("This is before method method");
	}

	@AfterMethod
	void after_method() {
		System.out.println("This is after method method");
	}

	@BeforeClass
	void before_class() {
		System.out.println("This is before class method");
	}

	@AfterClass
	void after_class() {
		System.out.println("This is after class method");
	}
	
	@BeforeTest
	void before_test() {
		System.out.println("This is before test method");
	}

	@AfterTest
	void after_test() {
		System.out.println("This is after test method");
	}
	
	@BeforeSuite
	void before_suite() {
		System.out.println("This is before suite method");
	}

	@AfterSuite
	void after_suite() {
		System.out.println("This is after suite method");
	}
}
