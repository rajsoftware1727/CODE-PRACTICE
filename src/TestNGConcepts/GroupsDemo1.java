package TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupsDemo1 {
	
	//@Parameters("aki")
	@Test(groups="Apple")
	public static void A()
	{
		System.out.println("hai am Akila from apple");
	}
	@Test(groups="Orange")
	public static void B()
	{
		System.out.println("hai am Akila from apple");
	}

}
