import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampDemo {
	
	public static void main(String args[])
	{
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy--HH.mm.ss");
		Date d=new Date();
 
		String time=df.format(d);
		System.out.println(time);
		 int g=d.compareTo(new Date(20-06-2023));
		 System.out.println(g);
		
		 

		
 		
	}

}
