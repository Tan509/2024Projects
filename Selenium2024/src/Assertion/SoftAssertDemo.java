package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void testSoft1()
	{
	
		/*SoftAssert assertion = new SoftAssert();
		System.out.println("Test Started 1");
		assertion.assertEquals(12, 13,"Count Doesnt match");
		System.out.println("Test Complete 1");
		assertion.assertAll();*/
		
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(12, 13);
		assertion.assertAll();
	}
	
	
	
	@Test
	public void testSoft2()
	{

		System.out.println("Test Started 2");
		Assert.assertEquals(12, 13);
		System.out.println("Test Started 2");
		
	}
	
}
