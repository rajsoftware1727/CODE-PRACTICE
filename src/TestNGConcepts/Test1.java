package TestNGConcepts;

import org.testng.annotations.Test;

public class Test1 extends Base{
	
	@Test
	public static void openGoogle() throws InterruptedException
	{
		System.out.println("I am running thread no is "+Thread.currentThread().getId());
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		System.out.println("Title of google is "+driver.getTitle());
	}
	
	@Test
	public static void openFaceBook() throws InterruptedException
	{
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		driver.get("http://www.facebook.com");
		Thread.sleep(5000);

		System.out.println("Title of facebook is "+driver.getTitle());
	}

}
