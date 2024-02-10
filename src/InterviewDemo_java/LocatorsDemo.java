package InterviewDemo_java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {
	static WebDriver driver;
	public static void main(String args[]) throws IOException
	{
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
 		driver.get("https://www.google.com");
		
		//locate elements css selectors
		
		//tag with class
		//WebElement t=driver.findElement(By.cssSelector("img.lnXdpd"));
 		//tag with id
		//WebElement t=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		//WebElement t=driver.findElement(By.xpath("//a[contains(@class,'gb_y')]"));
		//WebElement t=driver.findElement(By.xpath("//a[starts-with(@class,'gb')]"));
		WebElement t=driver.findElement(By.cssSelector("//a.gb_y[target='_top']"));




		border(t, driver);
		

}
	
	//method for border javascript
	
	public static void border(WebElement t,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid pink'",t);
		
	}
}
