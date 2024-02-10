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
import org.openqa.selenium.edge.EdgeDriver;

 
public class ImageComparisonDemo {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement t=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
 		 File i =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     //it take screen shot of entire page
 		 //get buffered image 
 		 BufferedImage g=ImageIO.read(i);
 		 //get dimension of element
 		 Point h=t.getLocation();
 		 int width=t.getSize().getWidth();
 		 int height=t.getSize().getHeight();
  		 BufferedImage bf=g.getSubimage(h.getX(),h.getY(), width, height);
  		 ImageIO.write(bf,"png",i);
 		 FileUtils.copyFile(i,new File("D:\\image\\100001.png"));
 		driver.close();
		
	}

}
