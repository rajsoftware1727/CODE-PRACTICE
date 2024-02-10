import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConceptReturnTypes {
	
	/*@Test(dataProvider="ff")
	public void enterNames(String s[])
	{
		System.out.println(s[0]);
	}
	
	@DataProvider(name="ff")
	public String[] data()
	{
		String[] a= {"raj","aki","thrishiv","nishavu"};
		return a;

     }*/
	

	/*@Test(dataProvider="hh")
	public void enterNames1(String s,String s1)
	{
		System.out.println(s1+s);
	}
	
	@DataProvider(name="hh")
	public String[][] data1()
	{
		String[][] a= {{"raj","aki"},{"thrishiv","nishavu"}};
		return a;

     }*/

	/*@Test(dataProvider="hh")
	public void enterNames1(String s[])
	{ 
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	@DataProvider(name="hh")
	public String[][] data1()
	{
		String[][] a= {{"raj","aki"},{"thrishiv","nishavu"}};
		return a;

     }*/
	/*@Test(dataProvider="hh")
	public void enterNames1(String s[])
	{
		System.out.println(s[0]);
	}
	
	@DataProvider(name="hh")
	public Iterator<String> data1()
	{
		 List<String> a=new ArrayList<>();
		 a.add("Aki");
		 a.add("raj");
		 return a.iterator();

     }*/
	@Test(dataProvider="hh")
	public void enterNames1(String s[][])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
		System.out.println(s[i][j]);
		}
		}
	}
	
	@DataProvider(name="hh")
	public Iterator<String[][]> data1()
	{
	
	
	
		 List<String[][]> a=new ArrayList<>();
		 a.add(new String[][] {{"aki","raj"},{"aki1","raj1"}});
		 a.add(new String[][] {{"thrishiv","nishavu"},{"thrishiv1","nishavu1"}});
		 return a.iterator();

     }
	/*@Test(dataProvider="hh")
	public void enterNames1(Object s[])
	{
		System.out.println(s[0]);
	}
	
	@DataProvider(name="hh")
	public Iterator<Object[]> data1()
	{
		 List<Object[]> a=new ArrayList<>();
		 a.add(new Object[] {"aki",1});
		 a.add(new Object[] {"thrishiv",2});
		 return a.iterator();

     }*/
}
