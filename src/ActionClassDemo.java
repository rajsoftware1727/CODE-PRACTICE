import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 
public class ActionClassDemo {
	
	public static void main(String args[]) throws InterruptedException
	{

		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement t=driver.findElement(By.name("q"));
		
		/*
		 *   Key Event 
		 */
		
		//1.Generate the Actions sequence
		//2.Build the Actions sequence
		//3.Perform the Actions sequence
		
 		
		Actions a=new Actions(driver);	
		
		/*a.keyDown(t,Keys.SHIFT);
		a.sendKeys("raj");
		a.keyUp(Keys.SHIFT);
		Action act=a.build();
		act.perform();*/
		
		// OR
		
		//a.keyDown(t,Keys.SHIFT).sendKeys("raj").keyUp(Keys.SHIFT).build().perform();
		
		/*
		 *   Mouse Event 
		 */
		/*Thread.sleep(3000);
		WebElement t1=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		a.moveToElement(t1).build().perform();
		a.click().build().perform();*/
		 

		//a.moveToElement(t1).click().build().perform();
		//a.contextClick(t).build().perform();
		WebElement t2=driver.findElement(By.xpath("//a[text()='Gmail']"));
 		a.contextClick(t2).build().perform();

 
 		 
 		

	}

}
