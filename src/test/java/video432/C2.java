package video432;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void method_2() {
		System.out.println("This is method 2");
	}	
	
	@BeforeTest
	void before_class() {
		System.out.println("This is before test method");
	}

	@AfterTest
	void after_class() {
		System.out.println("This is after test method");
	}
}
