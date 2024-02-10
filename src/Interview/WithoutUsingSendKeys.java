package Interview;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WithoutUsingSendKeys {
	public static WebDriver driver;
	public static void main(String args[]) throws IOException
	{
	System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	  driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	WebElement t=driver.findElement(By.id("APjFqb"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='raj'",t);
	driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).sendKeys(Keys.ENTER);
	setAlert("success raj");

}
	//create user defined Alerts
	
	public static void setAlert(String msg)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+msg+"');");

	}
}
