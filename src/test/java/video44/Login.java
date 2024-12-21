package video44;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1,groups={"sanity"})
	void loginByFacebook() {
		System.out.println("Login by facebook");
	}
	
	@Test(priority=2,groups={"sanity"})
	void loginByTwitter() {
		System.out.println("Login by twitter");
	}
	
	@Test(priority=3,groups={"sanity"})
	void loginByGmail() {
		System.out.println("Login by gmail");
	}
	
}
