import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class SetFormula {
	
	public static void main(String args[]) throws IOException
	{
		String path="C:\\Users\\AKILA RAJESH\\Downloads\\student.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("data100");
		String m="C2+D2";
		for(int i=1;i<5;i++)
		{
			 if(i==2)
			 {
				 m="C3+D3";
			 }
			 else if(i==3)
			 {
				 m="C4+D4";
			 }
			 else if(i==4)
			 {
				 m="C5+D5";
			 }
		sheet.getRow(i).getCell(4).setCellFormula(m);
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream(path);
		wb.write(fo);
		fo.close();
		System.out.println("fine");
		
 
	}

}
