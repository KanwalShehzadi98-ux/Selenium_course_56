package video436;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	@Test
	void hardAssertions() {
		
		Assert.assertEquals("Automation", "Autommation");
		Assert.assertNotEquals("Automation", "Autommation");
		Assert.assertTrue(1==2);
		Assert.assertFalse(1==2);
		Assert.fail();
	}
	
	
	@Test
	void softAssertions() {
		SoftAssert as = new SoftAssert();
		as.assertEquals("Automation", "Autommation");
		as.assertNotEquals("Automation", "Autommation");
		as.assertTrue(1==2);
		as.assertFalse(1==2);
		as.fail();
	}
}
