package Interview;

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
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ScreenShotDemo {
	
	public static void main(String args[]) throws IOException
	{
	System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	//1.through takescreenshot
 	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	//File desc=new File("D:\\google.jpg");
	//FileUtils.copyFile(src, desc,true);
	WebElement t=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	
	//--------------------------
	//get location of element
	//----------------------------
	Point location=t.getLocation();
	int x=location.getX();
	int y=location.getY();
	
	//--------get element width and height----------------
	
	int tWidth=t.getSize().getWidth();
	int tHeight=t.getSize().getHeight();
	
	//for image processing create object of buffered class
	
	BufferedImage img=ImageIO.read(src);
	BufferedImage timage=img.getSubimage(x, y, tWidth, tHeight);
	ImageIO.write(timage,"jpg",src);
	FileUtils.copyFile(src,new File("D://images//1.jpg"));
	System.out.println(x+""+y+""+tWidth+""+tHeight);
	
	System.out.println("yes success");
	
	
	 
    driver.close();
}
}
