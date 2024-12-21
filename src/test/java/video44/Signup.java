package video44;

import org.testng.annotations.Test;

public class Signup {

	@Test(priority=1,groups={"regression"})
	void signupByFacebook() {
		System.out.println("Signup by facebook");
	}

	@Test(priority=2,groups={"regression"})
	void signupByTwitter() {
		System.out.println("Signup by twitter");
	}
	
	@Test(priority=3,groups={"regression"})
	void signupByGamil() {
		System.out.println("Signup by gmail");
	}
}
