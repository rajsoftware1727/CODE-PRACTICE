
public class PolindromeDemo {
	
	//reverse the given string
	
	public static void main(String args[])
	{
		String name="abc";
		String reverse="";
		for(int i=name.length();i>0;i--)
		{
			reverse=reverse+name.charAt(i-1);
		}
		System.out.println(reverse);
	}

}
