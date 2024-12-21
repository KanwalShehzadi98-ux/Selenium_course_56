package video44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 {
	
	/*
	 * Total tests run: 5, Passes: 0, Failures: 1, Skips: 4
	 */

	@Test(priority=1)
	void openApp() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=4, dependsOnMethods= {"login"})
	void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}
