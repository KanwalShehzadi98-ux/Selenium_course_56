package video436;

import org.testng.annotations.Test;

public class NormalValidation {
	
	@Test
	void simpleAssertions(){
		String s1 = "automation";
		String s2 = "automations";
		if(s1.equals(s2)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
}

/*
Test Failed
PASSED: simpleAssertions

Even we have test failed but still simpleAssetions as PASSED

*/