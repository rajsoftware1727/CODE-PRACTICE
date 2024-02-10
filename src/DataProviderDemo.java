 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="hh")
	 public static void test(String s[][])
	 {
		System.out.println(s[0][0]);
	 }
	 
	@DataProvider(name="hh")
	 public static String[][] t()
	 {
		 String s[][]={{"aki","raj"},{"aki1","raj1"}};
		 return s;
	 }
}
