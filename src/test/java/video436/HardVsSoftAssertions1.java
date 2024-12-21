package video436;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions1 {

	@Test
	void hardAssertion() {
		System.out.println("1");
		System.out.println("1");
		Assert.assertEquals("kan", "wal");
		System.out.println("1");
		System.out.println("1");

	}
	
	@Test
	void softAssertion() {
		System.out.println("2");
		System.out.println("2");
		SoftAssert as = new SoftAssert();
		as.assertEquals("kan", "wal");
		System.out.println("2");
		System.out.println("2");
		as.assertAll();
	}
	
}
