package TakeScreenShotDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Google1 {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		  driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		//find weblementlogo
		
		WebElement logo=findWebElement("//img[@class='lnXdpd']");
		//take screenshot
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//get buffered image from file
		
		BufferedImage img=ImageIO.read(screenshot);
		
		//get element location 
		
		Point location=logo.getLocation();
		
		//get element width and height
		
		int width=logo.getSize().getWidth();
		int height=logo.getSize().getHeight();
		
		//get subimage from buffered image
		
		BufferedImage elementImage=img.getSubimage(location.getX(),location.getY(), width, height);
		ImageIO.write(elementImage,"png", screenshot);
		FileUtils.copyFile(screenshot,new File("D:\\Images\\\'"+getTimeStamp()+"\'.png"));
 		driver.close();
		File f=new File("D:\\Images\\google.png");
		BufferedImage eimg=ImageIO.read(f);
		findImageDifference(elementImage,eimg);
		
		
		}
	
	
	//method for find the webelement
	
	public static WebElement findWebElement(String xpath)
	{
		WebElement element=driver.findElement(By.xpath(xpath));
		return element;
	}
	
	public static String getTimeStamp()
	{
		String timeStamp=new SimpleDateFormat("dd-MM-yyyy.HH.ss.mm").format(new Date());
		return timeStamp;
 	}
	
	public static void findImageDifference(BufferedImage eimg,BufferedImage aimg)
	{
		ImageDiffer differ=new ImageDiffer();
		ImageDiff diff=differ.makeDiff(eimg,aimg);
		if(diff.hasDiff())
		{
			System.out.println("images are different");
		}
		else
		{
			System.out.println("images are same");

		}
	}
	

}
