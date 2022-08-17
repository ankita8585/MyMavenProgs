package under_maven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	@BeforeMethod
	public void addToCart() {
		System.out.println("Add product into cart -- Before Method");
	}
	
	
	@Test(priority=1)
	public void purchaseOnline() {
		System.out.println("Purchase from amazon.in -- Test P1");
	}
	
	@Test(priority=2)
	public void paymentOption() {
		System.out.println("Payment options -- Test P2");
	}
	
	
	@AfterMethod
	public void orderStatus() {
		System.out.println("Check order status -- After Method");
	}


}
