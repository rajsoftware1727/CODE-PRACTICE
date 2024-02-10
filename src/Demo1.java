 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {
	
	/*
	 * creating for time stamp
	 */
/*public static void main(String args[])
{
	//create time stamp
    SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyy/HH.mm.ss");
    Date d=new Date();
    String date=df.format(d);
    System.out.println("Date is "+date.split("/")[0]);
    System.out.println("Time is "+date.split("/")[1]);

}*/
	/*
	 * testing to read excel file
	 */
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\AKILA RAJESH\\Downloads\\DataProvider.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("Login");
		int totalRows=sheet.getPhysicalNumberOfRows();
		int totalColumns=sheet.getRow(1).getPhysicalNumberOfCells();
		for(int i=0;i<totalRows;i++)
		{
			XSSFRow currentRow=sheet.getRow(i);
			for(int j=0;j<totalColumns;j++)
			{
				XSSFCell currentCell=currentRow.getCell(j);
				switch(currentCell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(currentCell.getStringCellValue()+" ");break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print((int)currentCell.getNumericCellValue()+" ");break;
 					
 				}
                System.out.print("            ");
  			}
         System.out.println();
		}
 		System.out.print("yes done");
	}
}
