import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {
	
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();	
	driver.manage().window().maximize();
	
	driver.get("http:www.google.com");
	
	/*
	 * find element by css property
	 */
	
	//WebElement t=driver.findElement(By.cssSelector("img.lnXdpd"));/*tag with class
	//WebElement t=driver.findElement(By.cssSelector("img[alt='Google']")); /*tag with attribute value*/
	//WebElement t=driver.findElement(By.cssSelector("img.lnXdpd[alt='Google']")); /*tag and class with attribute value*/
	
	/*
	 *   find element by xpath
	 */
	
	//WebElement t=driver.findElement(By.xpath("//img[@class='lnXdpd']"));  /*normal xpath*/
	
	//WebElement t=driver.findElement(By.xpath("//img[@class='lnXdpd']"));  /*normal xpath*/
	
	//WebElement t=driver.findElement(By.xpath("//a[text()='Gmail']"));  /* using text method*/
	
	//WebElement t=driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail (opens a new tab)')]"));  /* using contains method*/

	//WebElement t=driver.findElement(By.xpath("//a[starts-with(@aria-label,'Gmail')]"));  /* using starts-with method*/
	//WebElement t=driver.findElement(By.xpath("//a[starts-with(@target,'_to')]"));  /* using starts-with method*/
	
	WebElement t=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));  /* using starts-with method*/


	
	

	


	border(t);
	Thread.sleep(2000);
	driver.close();

}


public static void border(WebElement t)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'",t);
}
}
