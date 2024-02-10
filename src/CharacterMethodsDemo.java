import org.testng.annotations.Test;

public class CharacterMethodsDemo {
	
	@Test
	public static void testCharacter()
	{
		String g="12345";
		boolean t=Character.isDigit(g.charAt(0));
		System.out.println(t);
		char[] a=g.toCharArray();
		boolean h=Character.isDigit(a[1]);
		System.out.println(h);
		System.out.println(isOnlyDigits(g,g.length()));
	}

	public static boolean isOnlyDigits(String g,int h)
	{
		for(int i=0;i<g.length();i++)
		{
		 if(!Character.isDigit(g.charAt(i)))
		 {
			 return false;
		 }
		}
		return true;
	}
}
