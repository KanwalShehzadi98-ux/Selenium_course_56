package video42;

import org.testng.annotations.Test;

/*
 * Open App
 * Login
 * Logout
 */

public class FirstTestCase {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("Opening App");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("Logging into the app");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("Logging out from the app");
	}	
}
