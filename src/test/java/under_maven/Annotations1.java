package under_maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite method executed");
	}

	@BeforeClass
	public void before() {
		System.out.println("beforeclass is executed");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("before test method executed");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod is executed");
	}

	@Test(priority=2)
	public void logintest() {
		System.out.println("login method");
	}

	@Test
	public void validtest() {
		System.out.println("test1 method executed");
	}

	@Test(priority=1)
	public void yellowtest()
	{
		System.out.println("I am may be the last test");
	}

	@Test(priority=1)
	public void executiontest() {
		System.out.println("test2 method executed");
	}

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite method executed");
	}

	@AfterClass
	public void after() {
		System.out.println("after class executed");
	}

	@AfterTest
	public void aftertest()
	{
		System.out.println("after test method executed");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method executed");
	}

}
