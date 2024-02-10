import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.name("birthday_day"));
		Select s=new Select(ele);
		s.selectByValue("23");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}
