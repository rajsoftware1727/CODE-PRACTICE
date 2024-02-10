import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {
	
	public static void main(String args[]) throws IOException 
	{
		
		Object studentdata[][]= {{"s.name","s.id","s.marks"},{"raj","100","marks1"},{"aki","200","marks2"}};
		FileOutputStream file=new FileOutputStream(".\\src\\studentdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("studentData");
		int rowcount=0;
		for(Object t[]:studentdata)
		{
			XSSFRow currentrow=sheet.createRow(rowcount);
			rowcount++;

			int cellcount=0;
			for(Object c:t)
			{
				XSSFCell currentcell=currentrow.createCell(cellcount++);
				if(c instanceof String)
				currentcell.setCellValue((String)c);
				if(c instanceof Integer)
					currentcell.setCellValue((Integer)c);
				if(c instanceof Boolean)
					currentcell.setCellValue((Boolean)c);
			}
		}
 		
		
		workbook.write(file);
		file.close();
		System.out.println("successfullycreated");
		
		
	}

}
