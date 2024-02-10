import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTheDataIntoEXcelFile {
	
	public static void main(String args[]) throws IOException
	{
		
		Object empData[][]= {{"100","raj","good"},{"200","aki","good"},{"300","raj1","good"}};
		String path="C:\\Users\\AKILA RAJESH\\empdata.xlsx";
		FileOutputStream file=new FileOutputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("EmpData.xlsx");
		int rowcount=0;
		for(Object t[]:empData)
		{
			
		
		XSSFRow currentrow=sheet.createRow(rowcount);
		rowcount++;
		int colcount=0;
		for(Object g:t)
		{
			XSSFCell currentcell=currentrow.createCell(colcount++);
			if(g instanceof String)
				currentcell.setCellValue((String)g.toString());
			if(g instanceof Integer)
				currentcell.setCellValue((Integer)g);
			if(g instanceof Boolean)
				currentcell.setCellValue((Boolean)g);
			
 		}
		
		}
		
		workbook.write(file);
		file.close();
		System.out.println("created succesfully");
		
		
		
	}

}
