package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {

	
	//Assert is the separate class of test ng which will allow u to compare values.
	
	/*@Test
	public void test1()
	{
		
		Assert.assertEquals(12, 13);
		
	}
	*/
	
	
	@Test
	public void test2()
	{
		System.out.println("Test case started 2");
		Assert.assertEquals(12, 13,"DropDoen Count is not matched please check with devloper");
		System.out.println("Test case compltes 2");
	}
	
	
	
	/*@Test
	public void test3()
	{
		System.out.println("Test case started 3");
		Assert.assertEquals("Hello", "Hello","Words does not match please raise a bug");
		System.out.println("Test case completes 3");
	}*/
}
