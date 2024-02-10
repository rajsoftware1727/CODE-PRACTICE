package SeleniumConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownClass {
	
	//select drop down options data's are sorted or not we will verify 
	public static void main(String args[])
	{
		//set the system property
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://passportindia.gov.in/AppOnlineProject/statusTracker/trackStatusInpNew");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("optStatus"));
		Select s=new Select(element);
		List<WebElement> dropdownlist=new ArrayList<WebElement>();
		List<String> originalList=new ArrayList<String>();
		List<String> tempList=new ArrayList<String>();


		dropdownlist=s.getOptions();
		int totalitems=dropdownlist.size();
		System.out.println("total dropdown web elements are"+totalitems);
		dropdownlist.remove(0);
 		for(WebElement e:dropdownlist)
		{
 			String data=e.getText();
 			if(data.charAt(0)!='-')
 			{
			originalList.add(data);
 			}
			
		}
 		
 		
		System.out.println("original list is "+originalList);

		tempList=originalList;
		System.out.println("Before Sorting "+tempList);

		Collections.sort(tempList);
		System.out.println("After Sorting "+tempList);

		 
		if(originalList==tempList)
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		driver.close();
 		
		
		
	}
	

}
