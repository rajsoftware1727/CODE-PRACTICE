import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

@Listeners(L.class)
public class ListenerDemo1 {
	SoftAssert s;
	@Test
	public void sum()
	{
		int a=10;int b=5;
		int c=a+b;
		int evalue=15;
		int avalue=c;
		  s=new SoftAssert();
	 		s.assertEquals(evalue,10);

 		s.assertEquals(evalue, avalue);
 		System.out.println("yes reached");
 		
 		s.assertAll();
	}
	
	

	@Test
	public void sub()
	{
		  s=new SoftAssert();

		int a=10;int b=5;
		int c=a-b;
		int evalue=25;
		int avalue=c;
		s.assertEquals(evalue, avalue);
		s.assertAll();
	}

}
