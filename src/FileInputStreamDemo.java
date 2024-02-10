import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\AKILA RAJESH\\empdata.xlsx");
 		 int c=file.read(); 
 		/* if(c!=-1)
 		 {
 			 System.out.println((char)c);
 		 }
		*/
 		 System.out.println(c);
	}

}
