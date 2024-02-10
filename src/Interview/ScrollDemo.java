package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollDemo {
	public static void main(String args[])
	{
	System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/");
	WebElement t=driver.findElement(By.xpath("//h2[text()='Kickstart your career']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,2000)");
	//js.executeScript("arguments[0].scrollIntoView();",t);
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	System.out.println("scrolled the page");
             
}
}
