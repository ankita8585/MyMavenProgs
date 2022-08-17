package under_maven;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAftertest {
	
	@BeforeTest
	public void addToCart() {
		System.out.println("Add product into cart");
	}
	
	
	@Test(priority=1)
	public void purchaseOnline() {
		System.out.println("Purchase from amazon.in");
	}
	
	@Test(priority=2)
	public void paymentOption() {
		System.out.println("Payment options");
	}
	
	
	@AfterTest
	public void orderStatus() {
		System.out.println("Check order status");
	}
}

 class TestAnnotation{
	
	@BeforeTest
	public void showable() {
		System.out.println("Before Test of TestExample3");
	}
	
	@BeforeTest
	public void presentable() {
		System.out.println("Before Test of TestExample3 - another method");
	}
	
	
	@Test
	public void display() {
		System.out.println("Method of TestExample3");
	}
	
}
