package TestNGConcepts;

import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestClarification extends Base{
 	@Test
	public static void insta()
	{
 		driver.get("https://www.instagram.com");
 		System.out.println("Title is "+driver.getTitle());
 		 System.out.println("am running thread no "+Thread.currentThread().getId());

	}
	
	@Test
	public static void google()
	{
		 
	driver.get("http://www.google.com");
	System.out.println("Title is "+driver.getTitle());
	 System.out.println("am running thread no "+Thread.currentThread().getId());

 	}

}
