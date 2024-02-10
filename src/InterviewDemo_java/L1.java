package InterviewDemo_java;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(ListenerDemo.class)
public class L1 {
	
	@Test
	public void test1()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(20,a+b);
	}
	
	@Test
	public void test2()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(21,a+b);
	}

}
