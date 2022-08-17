package under_maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
		public void Critical() {
		String ExpectedOutPut="We are learning English";
		String ActualOutPut="We are learning in English and Hindi";
		Assert.assertEquals(ActualOutPut, ExpectedOutPut);
	}
	
	@Test
	public void High()
	{
	boolean b1= 1<2;
	boolean b2= 2>3;
		Assert.assertTrue(b1!=b2,"2 never greater than 3");
		Assert.fail("Failing deliberately");
	}
	
	@Test
	public void Medium()
	{
		
	}

	@Test
	public void Low()
	{
		
	}
}
