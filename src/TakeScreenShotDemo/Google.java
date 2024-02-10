package TakeScreenShotDemo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Google {
    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        
          
        //navigate to url
        driver.get("https://google.com");
        
        // Locate the element on the web page
        WebElement logo = driver.findElement(By.xpath("//a[@class='gb_oa gb_ld gb_Nd gb_le']"));
        
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
        FileUtils.copyFile(screenshot, new File("D:\\Images\\sigin.PNG"));

        driver.quit();
    }
}