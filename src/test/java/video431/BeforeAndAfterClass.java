package video431;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {

	@Test
	void method_1() {
		System.out.println("This is method 1");
	}
	
	@Test
	void method_2() {
		System.out.println("This is method 2");
	}
	
	@BeforeClass
	void before_method() {
		System.out.println("This is before class method");
	}
	
	@AfterClass
	void after_method() {
		System.out.println("This is after class method");
	}
}
