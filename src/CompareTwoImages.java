import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareTwoImages {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement logo=driver.findElement(By.cssSelector("//img[@alt='Google']"));
		System.out.println("element found");
		/*AShot shot=new AShot();
		Screenshot g=shot.takeScreenshot(driver, logo);
		System.out.println("taken");
		Thread.sleep(2000);
		BufferedImage bf=g.getImage();
		ImageIO.write(bf,"png",new File("C:\\Users\\AKILA RAJESH\\image\\2.png"));*/
		Screenshot g=new AShot().takeScreenshot(driver, logo);
		ImageIO.write(g.getImage(),"png",new File("C:\\Users\\AKILA RAJESH\\image\\2000.png"));
		Thread.sleep(2000);
		System.out.println("element saved into file");
 		/*BufferedImage expImage=ImageIO.read(new File("C:\\Users\\AKILA RAJESH\\Downloads\\3.png"));
		System.out.println("yes completed");
		ImageDiffer differ=new ImageDiffer();
		ImageDiff diff=differ.makeDiff(bf, expImage);
		if(diff.hasDiff())
		{
			System.out.println("images are different");
		}
		else
		{
			System.out.println("images are same");
		}*/
		
		
 		
		
		driver.close();
	}

}
