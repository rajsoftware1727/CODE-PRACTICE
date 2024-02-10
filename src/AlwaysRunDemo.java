import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AlwaysRunDemo {
	
	@Test
	public void open()
	{
		Assert.assertEquals(5,10);
		System.out.println("open");
		
	}
	@Test(dependsOnMethods="open",alwaysRun=true)
	public void login()
	{
		System.out.println("login");
		Reporter r=new Reporter();
		r.log("test completed");
		

	}
	

}
