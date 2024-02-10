import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {
	
	public static void main(String args[]) throws InterruptedException
	{

		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).click();
		System.out.println("element identified");
  
 		Set<String> windowids=driver.getWindowHandles();
        //driver.close();

		for(String i:windowids)
		{
			System.out.println(i.toString());
			System.out.println(i);
			Thread.sleep(5000);
			String data=driver.switchTo().window(i).getTitle();
			System.out.println(data);
		}
		
		driver.close();
 
		
	}

}
