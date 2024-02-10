package TakeScreenShotDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TSSDemo {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/html/");
		driver.get("http://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		/*
		 * output type as file
		 */
		/*File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile=new File("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\1.jpg");
		FileUtils.copyFile(srcFile, desFile);*/
		
		/*
		 * output type as bytes
		 */
		
		/*byte[] image=ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fo=new FileOutputStream("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\2.jpg");
		fo.write(image);
		fo.close();*/
		
		/*
		 * output type as base64
		 */
		
		/*String img=ts.getScreenshotAs(OutputType.BASE64);
		byte[] f=Base64.getDecoder().decode(img);
		FileOutputStream fo=new FileOutputStream("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\3.jpg");
		fo.write(f);
		fo.close();*/
		
		/*
		 * using AShot take screen shot
		 */
		/*WebElement t=driver.findElement(By.xpath("//a[text()='Study our free HTML Tutorial »']"));
		AShot shot=new AShot();
		Screenshot g=shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage h=g.getImage();
		ImageIO.write(h,"jpg",new File("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\4.jpg"));*/
		
		/*
		 * take screen shot for particular element 
		 */
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
 		WebElement t=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
 		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid aqua'",t);
		Thread.sleep(3000);
		BufferedImage r=ImageIO.read(srcFile);
		 
		
		Point b=t.getLocation();
		int x=b.getX();
		int y=b.getY();
		
		int width=t.getSize().getWidth();
		int height=t.getSize().getHeight();
 		
		BufferedImage im=r.getSubimage(x,y,width,height);
		ImageIO.write(im,"jpg",srcFile);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\AKILA RAJESH\\Downloads\\screen\\1000.jpg"));
		

		
		driver.close();
		System.out.println("screen shot taken successfully");
		
		
	}
	

}
