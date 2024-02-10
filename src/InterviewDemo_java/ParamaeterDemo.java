package InterviewDemo_java;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaeterDemo {
	
	@Test()
	@Parameters("raj")
	public void test1(String g)
	{
		System.out.println("test 1"+" "+g);
	}
	
	@Test()
	@Parameters("raj")
	public void test2(String g)
	{
		System.out.println("test 2"+" "+g);
	}

}
