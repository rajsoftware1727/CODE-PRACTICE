package TestNGConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

 
public class SoftHardAssertionDemo {
	
	 
	WebDriver driver;

	@BeforeTest
	public void test1()
	{

		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		  driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	}
	@Test(priority=1)
	public void test2()
	{
		SoftAssert a=new SoftAssert();
		driver.findElement(By.id("email")).sendKeys("aki");
		driver.findElement(By.id("pass")).sendKeys("akilarajesh");

		driver.findElement(By.name("login")).click();
		String eText=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		a.assertEquals("The password that you've entered is ncorrect. Forgotten password?",eText,"text mismatch");
		System.out.println("hai raj am executed");
		a.assertAll();
		}
	
	 
 	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
