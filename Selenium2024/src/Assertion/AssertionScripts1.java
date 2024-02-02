package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts1 {

	@Test
	public void test1()
	{
		String myStr = "Tanvi Marne";
		Assert.assertTrue(myStr.contains("Tanvi"),"Names not matching");
		
	}
	
	@Test
	public void test2()
	{
		
		Assert.assertTrue(false);
		
	}
	
}
