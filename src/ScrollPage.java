import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollPage {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)","");
		WebElement t=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].scrollIntoView();",t);
		js.executeScript("alert('Rajesh got it');");
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border='3px solid yellow'",t);
		System.out.println("yes got it");
		Thread.sleep(3000);
		driver.close();
	}

}
