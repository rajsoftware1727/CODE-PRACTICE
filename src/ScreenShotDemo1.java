import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotDemo1 {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/Formatting.html");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File g=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("D://image//1.jpg");
		Boolean n=g.canWrite();
		System.out.println(n);
		FileUtils.copyDirectory(g, f);
		
 		driver.close();
  	}
	

}
