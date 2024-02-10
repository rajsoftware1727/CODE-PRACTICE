package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Fb1 extends Base{
 	@Test
	public static void facebook()
	{
 		
 		driver.get("http://www.facebook.com");
 		System.out.println("The Title is "+driver.getTitle());
 		System.out.println("am running thread no "+Thread.currentThread().getId());
	}
	
	@Test
	public static void youtube()
	{
		 
	driver.get("https://www.youtube.com/");
	System.out.println("The Title is "+driver.getTitle());
	System.out.println("am running thread no "+Thread.currentThread().getId());

 	}

}
