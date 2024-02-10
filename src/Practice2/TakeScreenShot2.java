package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShot2 {
	
	public static void main(String args[])
	
	{
		
		
	
 		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
	   driver.get("http://www.google.com");

}
}
