import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePickerJavaScriptDemo {
	
 		
		public static void main(String args[]) throws InterruptedException
		{
			
			System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		 		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("document.getElementById('datepicker').value='03/13/2023'");
				driver.findElement(By.id("datepicker")).sendKeys("03/13/2023");

}
}
