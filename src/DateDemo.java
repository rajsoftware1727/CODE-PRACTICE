import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
	
	public static void main(String args[])
	{
		/*
		 * this is for create time stamp
		 */
		 Date d=new Date();
		 SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyy-HH.mm.ss");
		 String timestamp=df.format(d);
		 System.out.println(timestamp);
		 
		 /*
		  * this is for get values of given date
		  */
		 String date="March";
		 int g=DateTimeFormatter.ofPattern("MMMM").localizedBy(Locale.ENGLISH).parse(date).get(ChronoField.MONTH_OF_YEAR);
		 
		 //LocalDate h=LocalDate.parse(date, g);
		 System.out.println(g);
		 
 		 
		 
	}
 	

}
