import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FBLoginWithHashMap {
	
	public static HashMap<Character, String> LoginData()
	{
		HashMap<Character,String> data=new HashMap<Character,String>();
		data.put('A',"admin@123");
		data.put('B',"Raj@231");
		data.put('C',"admin@124");
		return data;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character from A or B or C or D");
 		String input=sc.next();
 		String g=LoginData().get(input.charAt(0));
 		String data[]=g.split("@");
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys(data[0]);
		driver.findElement(By.id("pass")).sendKeys(data[1]);
		driver.findElement(By.id("loginbutton")).click();
        driver.close();
		

	}

}
