package InterviewDemo_java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
	public static void main(String args[]) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		WebElement upload=driver.findElement(By.id("pickfiles"));
		
		upload.click();
		
		Robot r=new Robot();
		StringSelection str=new StringSelection("C:\\Users\\AKILA RAJESH\\OneDrive\\Pictures\\Screenshot 2023-06-22 133406.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("done");
	}

}
