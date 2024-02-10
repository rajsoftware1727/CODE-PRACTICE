import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreDataFromExcelToHashMap {
	
 	
	public static void main(String args[]) throws IOException
	{
		//Data Get From Excel And Write Into HashMap
		
		Map<String,String> map=new HashMap<String,String>();

		
		FileInputStream file=new FileInputStream("C:\\Users\\AKILA RAJESH\\Downloads\\DataProvider.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Login");
		int totalrows=sheet.getPhysicalNumberOfRows();
		System.out.println(totalrows);
		int totalcolumns=sheet.getRow(0).getPhysicalNumberOfCells();
		int count=0;
		for(int row=1;row<totalrows;row++)
		{
			XSSFRow currentrow=sheet.getRow(row);
			String key=currentrow.getCell(0).getStringCellValue();
			String value=currentrow.getCell(1).getStringCellValue();
			System.out.println(key+" "+value);
			map.put(key, value);
			count++;
 			
		}
		System.out.println(count);
		/*for(Map.Entry<String,String> i:map.entrySet())
		{
			System.out.print(i.getKey()+" "+i.getValue());
			System.out.println(" ");
		}*/
System.out.println("successfully read and stored to hashmap");		
System.out.println(map.size());
}
	
}
