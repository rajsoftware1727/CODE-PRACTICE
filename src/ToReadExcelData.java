import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ToReadExcelData
 {
	public static void main(String args[]) throws IOException
	{
		String path="C:\\Users\\AKILA RAJESH\\Downloads\\student.xlsx";
		FileInputStream fi=new FileInputStream(path);
 
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("data");
		int totalRows=sheet.getPhysicalNumberOfRows();
		int totalColumn=sheet.getRow(0).getPhysicalNumberOfCells();
		 Iterator iterator=sheet.iterator();
		 while(iterator.hasNext())
		 {
		 XSSFRow currentrow=(XSSFRow) iterator.next();
		Iterator celliterator=currentrow.iterator();
		while(celliterator.hasNext())
		{
		 XSSFCell currentcell=(XSSFCell) celliterator.next();
		 switch(currentcell.getCellType())
		 {
		 case Cell.CELL_TYPE_STRING:
			 System.out.print(currentcell.getStringCellValue()+" ");break;
		 case Cell.CELL_TYPE_BOOLEAN:
			 System.out.print(currentcell.getBooleanCellValue()+" ");break;
		 case Cell.CELL_TYPE_NUMERIC:
			 System.out.print((int)currentcell.getNumericCellValue()+" ");break;
		 
			 
		 }
		 
		}
		System.out.println(" ");
		 }
	}
	 
 }