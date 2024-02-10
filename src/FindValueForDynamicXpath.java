import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class FindValueForDynamicXpath {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		/*driver.findElement(By.name("uid")).sendKeys("mngr497976");
		driver.findElement(By.name("password")).sendKeys("apAvazU");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String text=driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
		System.out.println(text);*/
		driver.findElement(By.name("uid")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
  		driver.findElement(By.name("password")).sendKeys();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

 		driver.findElement(By.name("uid")).sendKeys("");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

 		String errmessage=driver.findElement(By.xpath("//label[@id='message23']")).getText();
 		String errmessage1=driver.findElement(By.xpath("//label[@id='message18']")).getText();

 		
 		
        System.out.println(errmessage);
        System.out.println(errmessage1);


		//driver.close();
		//String cusid=driver.findElement(By.xpath("//tbody//tr[4]//td[2]")).getText();
 		//String cusname=driver.findElement(By.xpath("//tbody//tr[5]//td[2]")).getText();
   		driver.close();
		/*System.out.println(cusid);

		System.out.println(cusname);
		int eValue=5;
		int aValue=cusid.length();
		if(eValue==aValue)
		{
			System.out.println("test passed");
 		}
		else
		{
			System.out.println("test failed");
		}*/
 		 
 


	}

}
