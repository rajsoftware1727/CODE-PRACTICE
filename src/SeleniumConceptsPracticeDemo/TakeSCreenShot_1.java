package SeleniumConceptsPracticeDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;




public class TakeSCreenShot_1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/Formatting.html");
		WebElement element=driver.findElement(By.xpath("//img[@src='raj.png']"));
		System.out.println("element identified");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid aqua'",element);
		//take screen shot
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\AKILA RAJESH\\screenshot\\1.jpg");
        FileUtils.copyFile(srcfile, destfile);
        System.out.println("yes ok");
		File f=new File("C:\\Users\\AKILA RAJESH\\screenshot\\1.jpg");

		
		
		 
		if(f.exists())
		{
			System.out.println("file present");
		}
		else
		{
			System.out.println("file not present");
		}
		
		
		
		
		
		
		
 
	}

}
