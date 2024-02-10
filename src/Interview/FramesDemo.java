package Interview;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {
	
	public static void main(String args[]) throws IOException
	{
	System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(frame1);
	WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@id='a']")).click();
 	driver.switchTo().defaultContent();
	WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(frame2);
	WebElement t=driver.findElement(By.xpath("//select[@id='animals']"));
	Select s=new Select(t);
	s.selectByVisibleText("Baby Cat");


	//driver.close();

	 
	
	}
	

}
