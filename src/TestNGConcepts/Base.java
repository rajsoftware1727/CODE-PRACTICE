package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

 
public class Base {
	public static WebDriver driver;
	
	@Parameters("browserName")
 	@BeforeTest
	public static void openBrowser(String b)
	{
		String browserName=b;
		if(browserName.equalsIgnoreCase("Edge"))
		{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		  driver=new EdgeDriver();
		driver.manage().window().maximize();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
	}
	
	@AfterTest
	public static void tearDown()
	{
		driver.close();
	}

}
