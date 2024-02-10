import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Locators {
	
	
	@Test
	public void test() throws InterruptedException
	{
		
	
	 
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement element=driver.findElement(By.cssSelector("textarea[aria-owns=Alh6id]"));
		WebElement element=driver.findElement(By.cssSelector("textarea#APjFqb"));

		System.out.println("Elements identified");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid yellow'",element);
		System.out.println(element.getCssValue("line-height"));
		driver.close();
		
	}
	
	@Test
	public void open()
	{
		System.out.println("opened");
	}
	
	@Test
	public void close()
	{
		System.out.println("closed");
	}


}
