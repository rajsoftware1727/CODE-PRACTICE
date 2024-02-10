package TakeScreenShotDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotTakenFromAshot {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/Formatting.html");
		WebElement t=driver.findElement(By.xpath("(//p[text()='Hi welcome'])[4]"));
		//screen shot taken by using Ashot class
		
		AShot shot=new AShot();
		Screenshot screenShot=shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,t); //it take screen shot
 		ImageIO.write(screenShot.getImage(),"jpg",new File("D:\\image\\331.jpg"));  //it write the screen shot image to given file
 		driver.close();
		
	}

}
