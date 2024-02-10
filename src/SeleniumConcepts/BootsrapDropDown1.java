package SeleniumConcepts;

 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootsrapDropDown1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		//set the system property
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		//WebElement ele=driver.findElement(By.id("dropdownMenuLink"));
		/*Select s=new Select(ele);
		List<WebElement> list=s.getOptions();
		for(WebElement t:list)
		{
			String data=t.getText();
			System.out.println(data);
		}*/
		//driver.findElement(By.id("dropdownMenuLink")).click();
		driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
		List<WebElement>list=driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuLink']//a"));
		System.out.println(list.size());
		for(WebElement t:list)
		{
			String data=t.getText();
			System.out.println(data);
		}
		Thread.sleep(5000);
		for(WebElement t:list)
		{
			String data=t.getText();
			if(data.equalsIgnoreCase("Something else here"))
			{
		      t.click();
		      Thread.sleep(5000);
			}
 		}
		

		
		driver.close();
		

}
}
