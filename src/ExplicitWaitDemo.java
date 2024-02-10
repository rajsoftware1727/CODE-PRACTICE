import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static WebDriverWait wait;
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
 		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement ele=driver.findElement(By.xpath("//button[@id='alert']"));
		ele.click();
		System.out.println(new Date());
		  wait=new WebDriverWait(driver,Duration.ofSeconds(6000));
		Alert g=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(g.getText());

		
		driver.switchTo().alert();
 		System.out.println(new Date());
		g.accept();
		WebElement ele1=driver.findElement(By.xpath("//button[@id='populate-text']"));
		ele1.click();
		System.out.println(new Date());
		wait=new WebDriverWait(driver,Duration.ofSeconds(11000));
		Boolean t=wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2[@id='h2']")),"Selenium Webdriver"));
		System.out.println(new Date());
		if(t)
		{
			String text=driver.findElement(By.xpath("//h2[@id='h2']")).getText();
			System.out.println(text);
		}
		WebElement ele2=driver.findElement(By.xpath("//button[@id='enable-button']"));
		WebElement ele3=driver.findElement(By.xpath("(//button[contains(@id,'able')])[2]"));
		 
		ele2.click();
		System.out.println(new Date());
		wait=new WebDriverWait(driver,Duration.ofSeconds(11000));
		System.out.println("The button is enable "+ele3.isEnabled());
		WebElement h=wait.until(ExpectedConditions.elementToBeClickable(ele3));
		System.out.println(new Date());
		
		System.out.println(h.getText());
		System.out.println("The button is enable "+ele3.isEnabled());

		 WebElement ele4=driver.findElement(By.xpath("//button[@id='display-other-button']"));
		 ele4.click();
		 WebElement ele5=driver.findElement(By.xpath("//button[@id='hidden']"));
		 System.out.println(new Date());
		 wait=new WebDriverWait(driver,Duration.ofSeconds(11000));
		 WebElement j=wait.until(ExpectedConditions.visibilityOf(ele5));
		 System.out.println(new Date());
		 System.out.println(j.getText());

		
 		driver.close();
 
	}

}
