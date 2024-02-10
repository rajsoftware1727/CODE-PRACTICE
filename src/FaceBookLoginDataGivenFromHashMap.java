import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookLoginDataGivenFromHashMap {
	
	public static Map<Character,String> LoginData()
	{
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('A',"Admin@admin");
		map.put('B',"Admin1@admin1");
		map.put('C',"Admin2@admin2");
		map.put('D',"Admin3@admin3");
		
        return map;

	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key A or B or C or D");
		String f=sc.next();
		String data=LoginData().get(f.charAt(0));
		String a[]=data.split("@");
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(a[0]);
		driver.findElement(By.id("pass")).sendKeys(a[1]);
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		driver.close();


		
		
	}

}
