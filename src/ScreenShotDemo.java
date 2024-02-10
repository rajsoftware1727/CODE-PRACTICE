import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class ScreenShotDemo {
	
	public static void border(WebDriver d,WebElement t)
	{
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].style.border='3px solid blue'",t);
	}
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/Formatting.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement logo=driver.findElement(By.xpath("//img[@src='raj.png']"));
		System.out.println("element identified");
		border(driver, logo);
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 /*
		  * screen shot taken as a file type
		  */
		/* File src=ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("D://image//2.jpg");
		 FileUtils.copyFile(src, des);
		 System.out.println("ok done");
		 System.out.println(des.getAbsolutePath());*/
		 
		 /*
		  * screen shot taken as a byte64
		  */
		 
		/* String base64=ts.getScreenshotAs(OutputType.BASE64);
		 byte[] g=Base64.getDecoder().decode(base64);
		 FileOutputStream fo=new FileOutputStream("D://image//3.jpg");
		 fo.write(g);
		 fo.close();*/
		 
		 /*
		  * screen shot taken as bytes
		  */
		 
		 /*byte[] g=ts.getScreenshotAs(OutputType.BYTES);
		  
		 FileOutputStream fo=new FileOutputStream("D://image//30.jpg");
		 fo.write(g);
		 fo.close();*/
 		 
		 AShot shot=new AShot();
		 Screenshot g=shot.takeScreenshot(driver);
		 //Screenshot g=shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,logo);
 		 BufferedImage h=g.getImage();
		 ImageIO.write(h,"jpg",new File("C:\\Users\\AKILA RAJESH\\selenium\\fullimage1.jpg"));
		 System.out.println("ok done");
		 
		 
		 
   		 driver.close();

	}
}