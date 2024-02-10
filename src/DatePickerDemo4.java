import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo4 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.path2usa.com/travel-companion/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement t=driver.findElement(By.xpath("//input[@placeholder='Date of travel']"));
			t.click();
 			WebElement t1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@aria-label='June 21, 2023']"))));

			System.out.println(t.getAttribute("class"));
			driver.close();

}
}
