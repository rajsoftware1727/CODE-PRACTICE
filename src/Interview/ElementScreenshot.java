package Interview;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ElementScreenshot {
	
	public static void main(String args[])
	{
		 
		WebDriver driver=new EdgeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE); //screenShot taken entire page 
		WebElement t=driver.findElement(By.xpath(""));
		
	}

}
