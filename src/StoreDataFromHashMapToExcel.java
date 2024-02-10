import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreDataFromHashMapToExcel  {
	
	public static void main(String args[]) throws IOException
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(100,"Rajesh");
		m.put(200,"Akila");
		m.put(300,"raja");

		System.out.println(m.entrySet());

		FileOutputStream file=new FileOutputStream("C:\\Users\\AKILA RAJESH\\Downloads\\Strudent.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("StudentData");
		sheet.createRow(0).createCell(0).setCellValue("id");
		sheet.createRow(0).createCell(1).setCellValue("name");
        int row=1;
 		for(Map.Entry<Integer, String> i:m.entrySet())
		{
			 
 		
		
 
	 
			XSSFRow currentRow=sheet.createRow(row++);
			 
				 currentRow.createCell(0).setCellValue((int)i.getKey());
				 
				 currentRow.createCell(1).setCellValue(i.getValue());
				 
		
		}
		
	
workbook.write(file);
file.close();
System.out.println("work book created successfully");
	
	
	 	
	}	

}
