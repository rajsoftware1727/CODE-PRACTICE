package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	
	@Test
	@Parameters("gg")
	public void name(String g)
	{
		System.out.println(g);
	}
	
	@Test
	@Parameters("gg")
	public void name1(String g)
	{
		System.out.println(g);
	}

}
