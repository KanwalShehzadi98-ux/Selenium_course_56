package video436;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionValidation {

	@Test
	void validation() {
		String s1 = "automation";
		String s2 = "automations";
		//Assert.assertEquals(s1, s2);
		//Assert.assertEquals("automation", "automation");
		//or
		//Assert.assertTrue("automation".equals("automation"));
		Assert.assertTrue("automation".equals("automations"));
	}
}
