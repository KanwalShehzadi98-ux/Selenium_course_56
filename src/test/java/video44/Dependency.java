package video44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	/*
	 * In this if openApp gets executed even it is false or failed but the rest 4 will get executed,
	 * which I don't want, so for this  I need to set dependency
	 * Total tests run: 5, Passes: 4, Failures: 1
	 */

	@Test(priority=1)
	void openApp() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=2)
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout() {
		Assert.assertTrue(true);
	}
	
}
