 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	
	 FileInputStream file;
	  String path;
	  XSSFWorkbook workbook;
	XSSFRow Row;
	XSSFCell Cell;
	  XSSFSheet sheet;
 	
	
	//method for read the excel data
	@Test(dataProvider="ff")
	 
		public void Login(String uname,String pwd)
		{
			
		
		 
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		}
		 
 	@DataProvider(name="ff")
	public String[][]      DataReadFromExcel() throws IOException
	{
		  

		path="C:\\Users\\AKILA RAJESH\\Downloads\\DataProvider.xlsx";    //given the file path
		file=new FileInputStream(path);         //create the new file object to store the file
		workbook=new XSSFWorkbook(file);
		sheet=workbook.getSheet("Login");
		int totalRowspresent=sheet.getPhysicalNumberOfRows();
		int totalColumnpresent=sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[totalRowspresent][totalColumnpresent];
		for(int row=1;row<totalRowspresent;row++)
		{
			XSSFRow currentRow=sheet.getRow(row);
			for(int column=0;column<totalColumnpresent;column++)
			{
				XSSFCell currentcell=currentRow.getCell(column);
				
				data[row-1][column]=currentcell.getStringCellValue();
				/*for(String i[]:data)
				{
					for(String h:i)
					{
						System.out.println(h);
   					}
				}*/
  				 
			}
		}
		return data;
 		}

}
