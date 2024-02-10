package TakeScreenShotDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotForParticularElement {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("http:www.google.com");
		WebElement element=driver.findElement(By.xpath("//a[text()='Gmail']"));
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File f=screenshot.getScreenshotAs(OutputType.FILE);
		BufferedImage g=ImageIO.read(f);
		
		Point location=element.getLocation();
		
		int width=element.getSize().getWidth();
		int height=element.getSize().getHeight();
		
		BufferedImage j=g.getSubimage(location.getX(),location.getY(), width, height);
		
		ImageIO.write(j,"jpg",f);
		FileUtils.copyFile(f,new File("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\100.jpg"));
		driver.close();
		System.out.println("success");
	}

}
