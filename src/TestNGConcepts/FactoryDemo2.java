package TestNGConcepts;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryDemo2 {
	
	int i;
	FactoryDemo2(int g)
	{
		this.i=g;
	}
	
	@Test
	public void test1()
	{
		System.out.println(i+1);
	}
	
	@Test
	public void test2()
	{
		System.out.println(i+2);

	}
	
	 

}
 