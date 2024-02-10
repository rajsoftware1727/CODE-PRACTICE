import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	public static void main(String args[])
	{
		
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("")).sendKeys("",Keys.ENTER);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	WebElement t=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	
	t.click();
	//fluent wait   
	 Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(3000))
			 .pollingEvery(Duration.ofSeconds(2000))
			 .ignoring(Exception.class);
	 WebElement t1=
			 w.until(new Function<WebDriver,WebElement>()
			 {

				@Override
				public WebElement apply(WebDriver t) {
					// TODO Auto-generated method stub
					return t.findElement(By.xpath(""));
 				}
		 
			 });
   t1.click();
   w.until(new Function<WebDriver,WebElement>()
		   {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return null;
			}
	   
		   });
   WebElement g=w.until(new Function<WebDriver,WebElement>(){

	@Override
	public WebElement apply(WebDriver t) {
		// TODO Auto-generated method stub
		return t.findElement(By.id(""));
	}
	   
   });
   g.click();
   
	w.until(new Function<WebDriver,WebElement>()
			{

				@Override
				public WebElement apply
				(WebDriver t) {
					// TODO Auto-generated method stub
					return null;
				}
		
			});
	
	WebElement g1=w.until(new Function<WebDriver,WebElement>(){

		@Override
		public WebElement apply(WebDriver t) {
			// TODO Auto-generated method stub
			return t.findElement(By.xpath(""));
		}
			
	 
	});
	g1.click();
	

}
}
