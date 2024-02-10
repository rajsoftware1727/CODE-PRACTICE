
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilesDemo {
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://lpigroup.com/careers/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	 
 
	WebElement upload=driver.findElement(By.id("gform_browse_button_1_5"));
	 
	
  	upload.click();
  	//Runtime.getRuntime().exec("C:\\Users\\AKILA RAJESH\\AutoIt\\uploadfile9.exe"+" "+"C:\\Users\\AKILA RAJESH\\Resume CV.docx");
	
	 
 	Thread.sleep(3000);
	 

	Robot r=new Robot();
	StringSelection str=new StringSelection("C:\\Users\\AKILA RAJESH\\Resume CV.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("success");

	

	
	}

}
