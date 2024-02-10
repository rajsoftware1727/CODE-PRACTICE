package TakeScreenShotDemo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {
    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
        
          
        //navigate to url
        driver.get("https://demoqa.com");
        
        // Locate the element on the web page
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        
        // Get screenshot of the visible part of the web page
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Convert the screenshot into BufferedImage
        BufferedImage fullScreen = ImageIO.read(screenshot);
        
        //Find location of the webelement logo on the page
        Point location = logo.getLocation();
        
        //Find width and height of the located element logo
        int width = logo.getSize().getWidth();
        int height = logo.getSize().getHeight();

	//cropping the full image to get only the logo screenshot
        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
                width, height);
        ImageIO.write(logoImage, "png", screenshot);
        
        //Save cropped Image at destination location physically.
        FileUtils.copyFile(screenshot, new File("D:\\Images\\particularElementScreenshot0000.PNG"));

        driver.quit();
    }
}