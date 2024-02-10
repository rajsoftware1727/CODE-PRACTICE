import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String args[]) throws InterruptedException
	{
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();  
    driver.get("https://passportindia.gov.in/AppOnlineProject/statusTracker/trackStatusInpNew");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    WebElement element=driver.findElement(By.id("optStatus"));
    Select s=new Select(element);
    List<WebElement> options=s.getOptions();
    System.out.println(options.size());
    options.removeIf(n -> (n.getText().charAt(0)=='-'));
    System.out.println(options.size());
    System.out.println("Below are the original list");
    List<String> temp1=new ArrayList<String>();
    List<String> temp2=new ArrayList<String>();
    

    for(WebElement t:options)
    {
    	System.out.println(t.getText());
    	temp1.add(t.getText());
    	temp2.add(t.getText());

    	
    	
    }
     //temp2=temp1;
    System.out.println("before sorting");
    System.out.println("---------------");
    for(String h:temp1)
    {
    	System.out.println(h);
    }
    System.out.println("before sorting");
    System.out.println("---------------");
    for(String h:temp2)
    {
    	System.out.println(h);
    }
    Collections.sort(temp2);
    System.out.println("after sorting");
    System.out.println("---------------");

    for(String h:temp1)
    {
    	System.out.println(h);
    }
     
    System.out.println("after sorting");
    System.out.println("---------------");

    for(String h:temp2)
    {
    	System.out.println(h);
    }
    if(temp1==temp2)
    {
    	System.out.println("test pass");
    }
    else
    {
    	System.out.println("test fail");
    }
   String text=driver.findElement(By.className("mandatory_msg")).getText();
   System.out.println(text);
   List<WebElement> op=driver.findElements(By.xpath("(//div[@id='outer']//table)[1]"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].style.border='3px solid red'",op);
   Thread.sleep(3000);
    driver.close();

}
}
