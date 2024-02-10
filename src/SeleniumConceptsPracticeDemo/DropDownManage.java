package SeleniumConceptsPracticeDemo;

 import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownManage {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://bing.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='sb_form']")).sendKeys("selenium");
		System.out.println("element identified");
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
		for(WebElement i:list)
		{
			String elementname=i.toString();
			System.out.println(elementname);
		}

		
	}

}
