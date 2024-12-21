package video43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	
	@Test
	void method_1() {
		System.out.println("This is method 1");
	}
	
	@Test
	void method_2() {
		System.out.println("This is method 2");
	}
	
	@BeforeMethod
	void before_method() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	void after_method() {
		System.out.println("This is after method");
	}
}
