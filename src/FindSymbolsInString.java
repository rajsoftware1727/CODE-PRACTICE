import org.testng.annotations.Test;

public class FindSymbolsInString {
	
	@Test
	public static void test()
	{
		int symbolCount=0;
		String g="Rajesh@#$$%#3";
		for(int i=0;i<g.length();i++)
		{
			if(!Character.isLetterOrDigit(g.charAt(i)))
			{
				symbolCount++;
			}
		}
		System.out.println(symbolCount);
	}

}
