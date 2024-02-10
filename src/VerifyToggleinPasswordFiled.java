import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyToggleinPasswordFiled {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
  		WebElement pass=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
  		pass.sendKeys("haii");
 		String before=pass.getCssValue("spellcheck");
		Thread.sleep(3000);
		/*driver.findElement(By.cssSelector("input[name='password']")).sendKeys("ascascasc");
 		String after=pass.getAttribute("style");
		
		driver.findElement(By.cssSelector("input[name='uid']")).clear();*/
    		System.out.println(before);
  		//System.out.println(after);
  		driver.close();
  		 
		

		
		
	}

}
