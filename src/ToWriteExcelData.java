import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
 
public class ToWriteExcelData {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow currentRow;
	public static XSSFCell currentcell;
	public static FileOutputStream fo;
	public static void main(String args[]) throws IOException
	{
		String path="C:\\Users\\AKILA RAJESH\\Downloads\\student.xlsx";
		  fo=new FileOutputStream(path);
		  wb=new XSSFWorkbook();
		  sheet=wb.createSheet("data100");
		Object f[][]= {{"admin","admin",500,100},
				{"admin1","admin1",100,100},
				{"admin2","Admin2",200,100},
				{"admin3","Admin3",300,100}};
		  


/*	for(int row=0;row<f.length;row++)
		{
			XSSFRow currentRow=sheet.createRow(row);
			for(int column=0;column<f[0].length;column++)
			{
		 		XSSFCell currentCell=currentRow.createCell(column);
		 		if(f[row][column] instanceof String )
		 		currentCell.setCellValue((String)f[row][column].toString());
		 		if(f[row][column] instanceof Integer )
		 			currentCell.setCellValue((Integer)f[row][column]);
		 			}*

		}*/
		 
 	int row=1;
	for(Object g[]:f)
	{
		  currentRow=sheet.createRow(row);
		int column=0;
		for(Object t:g)
		{
			  currentcell=currentRow.createCell(column);
			if(t instanceof String)
				currentcell.setCellValue((String)t.toString());
			if(t instanceof Integer)
				currentcell.setCellValue((Integer)t);
 			column++;
			currentRow.createCell(column);

			
			
		}
    row++;
 
	}

		wb.write(fo);
		
	fo.close();
	System.out.println("write success");
	 
	 
	

}
}
