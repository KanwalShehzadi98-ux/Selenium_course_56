package video44;

import org.testng.annotations.Test;

public class Payment {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentByDollars() {
		System.out.println("Payment By dollars");
	}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentByRupees() {
		System.out.println("Payment By rupees");
	}
}
