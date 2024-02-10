package TestNGConcepts;

import org.testng.annotations.Test;

public class ThreadDemo {
	
	@Test(threadPoolSize=2,invocationCount=2,timeOut=1000)
	public static void test1()
	{
		int a=10;int b=5;
		int sum=a+b;
		System.out.println("I am running thread no is "+Thread.currentThread().getId());
		System.out.println("sum is "+sum);
	}
	
	/*@Test
	public static void test2()
	{
		int a=10;int b=5;
		int sub=a-b;
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		System.out.println("sub is "+sub);
	}*/

}
