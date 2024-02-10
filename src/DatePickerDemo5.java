import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo5 {
	
 		
		public static void main(String args[]) throws InterruptedException
		{
			String date="25-12-2023";
			DateTimeFormatter g=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate h=LocalDate.parse(date, g);
			int day1=h.getDayOfMonth();
			int year=h.getYear();
			int month=h.getMonthValue();
 			
 			System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		 		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				WebElement d1=driver.findElement(By.id("datepicker"));
				d1.click();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement month1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']" ))));
  				String year2=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				int amonth= DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(year2).get(ChronoField.MONTH_OF_YEAR);

				int ayear=Integer.parseInt(year2);
				System.out.println(amonth);
				 
				

}
}
