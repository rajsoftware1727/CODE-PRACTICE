package Interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShotDemo2 {
	
	public static void main(String args[]) throws IOException
	{
	System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
	String g=ts.getScreenshotAs(OutputType.BASE64);
	File src=OutputType.FILE.convertFromBase64Png(g);
	FileUtils.copyFile(src,new File("D://images//2.png"));
 	driver.close();
	}
	

}
