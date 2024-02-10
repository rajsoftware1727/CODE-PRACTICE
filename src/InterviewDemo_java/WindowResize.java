package InterviewDemo_java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResize {
	
	public static void main(String args[])
	{
		/*
		 * resize browser window by setsize method and window.resizeTomethod
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int width=600;
		int height=400;
		Dimension dimension=new Dimension(width,height);
		//driver.manage().window().setSize(dimension);
 		//((JavascriptExecutor)driver).executeScript("window.resizeTo(600,400);");
 		((JavascriptExecutor)driver).executeScript("window.resizeTo(600,400);");

		driver.get("http://www.google.com");
	}

}
