package InterviewDemo_java;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement t=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		t.click();
		Alert g=driver.switchTo().alert();
		System.out.println(g.getText());

}
}