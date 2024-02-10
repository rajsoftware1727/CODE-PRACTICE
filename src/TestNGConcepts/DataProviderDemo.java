package TestNGConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	//return types of data provider
	
	/*@Test(dataProvider="gg")
	public void test1(Object s)
	{
		System.out.println("---->"+s);
	}
	
	@DataProvider(name="gg")
	public  Object aProvider()
	{
		Object data[]= {"raj",123,'c'};
		return data;
	}*/
	
	/*@Test(dataProvider="kk")
	public void test2(String name1,String name2)
	{
		System.out.println(name1+" "+name2);
	}
	
	@DataProvider(name="kk")
	public Object data()
	{
		Object data1[][]= {{"raj","aki"},{"thrishiv","nishavu"},{"koki","selva"}};
		return data1;
	}*/
	
	/*@Test(dataProvider="gg")
	public void test3(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}
	}
	
	@DataProvider(name="gg")
	public Iterator<String[]> data()
	{
		List<String[]> data=new ArrayList<String[]>();
		data.add(new String[]{"raj","raj","nishavu"});
		data.add(new String[] {"aki1","aki2","aki3"});
		return data.iterator();
		
	}*/
	
	@Test(dataProvider="gg")
	public void test3(String s[][])
	{
		/*for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}*/
		for(String s1[]:s)
		{
			for(String g:s1)
			{
				System.out.println(g);
			}
		}
	}
	
	@DataProvider(name="gg")
	public Iterator<String[][]> data()
	{
		List<String[][]> data=new ArrayList<String[][]>();
		data.add(new String[][]{{"raj","raj","nishavu"},{"raj1","raj2","raj3"}});
		data.add(new String[][] {{"aki1","aki2","aki3"}});
		return data.iterator();
		
	}
	
	
	

}
