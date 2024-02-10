import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TypeKeys {
	
	public static void main(String args[])
	{
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
 		driver.get("https://www.google.com");
 		//driver.findElement(By.name("q")).sendKeys("raj",Keys.ENTER);
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("document.getElementById('APjFqb').value='raj'");
 		
  		driver.switchTo();
 		System.out.println(driver.getTitle());
 		
 		//driver.close();
	}

}
