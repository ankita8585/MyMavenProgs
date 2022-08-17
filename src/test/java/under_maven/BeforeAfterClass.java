package under_maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	@BeforeClass
	public void before() {
		System.out.println("beforeclass is executed");
	}


	@Test(priority=1)
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test(priority=2)
	public void test2() {
		System.out.println("test2 executed");
	}


	@AfterClass
	public void after() {
		System.out.println("after class executed");
	}

}
