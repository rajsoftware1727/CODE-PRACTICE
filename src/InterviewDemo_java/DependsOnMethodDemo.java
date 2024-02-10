package InterviewDemo_java;

import org.testng.annotations.Test;

public class DependsOnMethodDemo {
	
	/*@Test
	public void test1()
	{
		System.out.println("i am test1");
	}
	
	@Test(dependsOnMethods= {"test3"})
	public void test2()
	{
		System.out.println("i am test2");

	}
	
	@Test
	public void test3()
	{
		System.out.println("i am test3");

	}*/
	
	/*
	 * depends on groups
	 */
	/*@Test(groups={"raj"})
	public void B()
	{
		System.out.println("i am test1");
	}
	
	@Test(dependsOnGroups= {"raj"})
	public void A()
	{
		System.out.println("i am test2");

	}
	
	@Test(groups={"raj"})
	public void C()
	{
		System.out.println("i am test3");
	}*/
	
	@Test
	public void Signin()
	{
		System.out.println("logged in");
	}
	
	@Test(dependsOnMethods= {"Openbrowser","Signin"})
	public void Logout()
	{
		System.out.println("logged out");
	}
	
	@Test
	public void Openbrowser()
	{
		System.out.println("browser opened");
	}
	
	 
	
	

}
