import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo2 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
	 		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			WebElement d1=driver.findElement(By.id("datepicker"));
			d1.click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement monthYear=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"))));
			String my=monthYear.getText();
 			String month=my.split(" ")[0];
 			String year=my.split(" ")[1];
 			while(!(month.equals("November")&&year.equals("2023")))
 			{
 				driver.findElement(By.xpath("//span[text()='Next']")).click();
 				Thread.sleep(2000);
 				monthYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
 				  my=monthYear.getText();
 	 			  month=my.split(" ")[0];
 	 			  year=my.split(" ")[1];
  			}
			  String day="22";

 			driver.findElement(By.xpath("//a[text()=\'"+day+"\']")).click();
 			/*for(int i=1;i<6;i++)
 			{
 				for(int j=1;j<=7;j++)
 				{
 		 			WebElement date=driver.findElement(By.xpath("(//tbody)[2]/tr["+i+"]/td["+j+"]"));
 		 			if(date.getText().equals("25"))
 		 			{
 		 				System.out.println(date.getText());
 		 				date.click();
 		 			}
 
 				}
 			}*/
 			/*List<WebElement> ele=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
 			for(WebElement t:ele)
 			{
 				if(t.getText().equals("16"))
 				{
 					t.click();
 				}
   			}
				System.out.println(ele.size());*/

 			
 			//driver.findElement(By.xpath("(//tbody)[2]/tr[4]/td[4]")).click();
 			
  			System.out.println(month);
 			System.out.println(year);
 			System.out.println(d1.getText());

 			
 			//driver.close();
		 

 		  
		 
	}

}
