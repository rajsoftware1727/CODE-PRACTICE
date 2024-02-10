import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GoogleDemo {
	
	@Test
	public static void test1()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("lti career");
		driver.findElement(By.xpath("//input[@value='Google Search'")).click();

	}

}
