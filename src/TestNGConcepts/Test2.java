package TestNGConcepts;

import org.testng.annotations.Test;

public class Test2 extends Base{
	
	@Test
	public static void openYoutube() throws InterruptedException
	{
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		driver.get("http://www.youtube.com");
		Thread.sleep(5000);

		System.out.println("Title of youtube is "+driver.getTitle());
	}
	
	@Test
	public static void openIndeed() throws InterruptedException
	{
		System.out.println("I am running thread no is "+Thread.currentThread().getId());

		driver.get("http://www.indeed.com");
		Thread.sleep(5000);

		System.out.println("Title of indeed is "+driver.getTitle());
	}

}
