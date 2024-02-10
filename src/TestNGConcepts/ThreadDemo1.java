package TestNGConcepts;

import org.testng.annotations.Test;

public class ThreadDemo1 {
	
	@Test
	public static void test1()
	{
		int a=10;int b=5;
		int mul=a*b;
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		System.out.println("mul is "+mul);
	}
	
	@Test
	public static void test2()
	{
		int a=10;int b=5;
		int div=a/b;
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		System.out.println("div is "+div);
	}

}
