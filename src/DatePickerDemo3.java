import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo3 {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
			  driver=new EdgeDriver();
			driver.manage().window().maximize();
	 		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			WebElement d1=driver.findElement(By.id("datepicker"));
			d1.click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement monthYear=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"))));
			 selectDate("25","March","2023");

 			
 			//driver.close();
		 

 		  
		 
	}

	
	         public static void selectDate(String date,String month1,String year1)
	         {
	        	 WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
	        	 WebElement pre=driver.findElement(By.xpath("//span[text()='Prev']"));

	        	 if(Integer.parseInt(date)>31)
	        	 {
	        		 System.out.println("Given date is invalid");
	        	 }
	        	 else
	        		 {
	        		 WebElement t=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	        		 
	        	 String monthYear=t.getText();
	        	String month=monthYear.split(" ")[0];
	        	String year=monthYear.split(" ")[1];
	        	List<String> months=new ArrayList<String>();
				List<WebElement> ele=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

	        	months.add("January");
	        	months.add("February");
	        	months.add("March");
	        	months.add("April");
	        	months.add("May");
	        	if(year.equals(year1))
	        	{
	        		for(String b:months)
	        		{
	        			if(b.equals(month))
	        			{
	        				while(!(month.equals(month1)))
	        		        		{
	        		        			pre.click();
	        		        			  monthYear=t.getText();
	        		    	        	  month=monthYear.split(" ")[0];
	        		    	        	  year=monthYear.split(" ")[1];
	        		        			 
	        		        		}
 	        	 			for(WebElement t1:ele)
	        	 			{
	        	 				if(t1.getText().equals(date))
	        	 				{
	        	 					t1.click();
	        	 				}
	        	   			}
	        			}
	        			else 
	        			{
	        				while(!(month.equals(month1)))
    		        		{
    		        			next.click();
    		        		}
     	 			for(WebElement t1:ele)
    	 			{
    	 				if(t1.getText().equals(date))
    	 				{
    	 					t1.click();
    	 				}
    	   			}
	        				
	        			}
	        		}
	        		 
	        	}
	        	if(Integer.parseInt(year)>Integer.parseInt(year1))
	        	{
	        		while(!(month.equals(month1)&&year.equals(year1)))
	        		{
	        			pre.click();
	        			monthYear=t.getText();
	    	        	  month=monthYear.split(" ")[0];
	    	        	  year=monthYear.split(" ")[1];
	        		}
	        		for(WebElement t1:ele)
    	 			{
    	 				if(t1.getText().equals(date))
    	 				{
    	 					t1.click();
    	 				}
    	   			}		
	        			
	        	}
	        	if(Integer.parseInt(year)<Integer.parseInt(year1))
	        	{
	        		while(!(month.equals(month1)&&year.equals(year1)))
	        		{
	        			next.click();
	        			monthYear=t.getText();
	    	        	  month=monthYear.split(" ")[0];
	    	        	  year=monthYear.split(" ")[1];
	        		}
	        		for(WebElement t1:ele)
    	 			{
    	 				if(t1.getText().equals(date))
    	 				{
    	 					t1.click();
    	 				}
    	   			}		
	        			
	        	}
	        	 
	        	 

	        	 
	         }
 
	         }
	
}

