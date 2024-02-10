import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class AnchorTags {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
 		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		/*List<WebElement> AnchorTags=driver.findElements(By.tagName("a"));
		System.out.println(AnchorTags.size());
		for(WebElement e:AnchorTags)
		{
			System.out.println(e.getAttribute("href"));
		}*/
		WebElement t=driver.findElement(By.partialLinkText("Gma"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid green'",t);
		Thread.sleep(4000);
 		driver.close();

		
	}

}
