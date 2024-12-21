package video433;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	void method_2() {
		System.out.println("This is method 2");
	}	
	
	@BeforeSuite
	void before_class() {
		System.out.println("This is before suite method");
	}

	@AfterSuite
	void after_class() {
		System.out.println("This is after suite method");
	}
	
}
