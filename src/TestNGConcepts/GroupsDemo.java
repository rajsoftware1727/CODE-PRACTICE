package TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupsDemo {
	//@Parameters("raj")
	@Test(groups="Apple")
	public static void A()
	{
		System.out.println("hai am Rajesh from apple");
	}
	
	@Test(groups="Apple")
	public static void B()
	{
		System.out.println("hai am Rajesh1 from apple");
	}
	
	@Test(groups="Orange")
	public static void C()
	{
		System.out.println("hai am Rajesh from orange");
	}
	@Test(groups="Orange")
	public static void D()
	{
		System.out.println("hai am Rajesh1 from orange");
	}

}
