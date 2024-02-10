package InterviewDemo_java;

public class ReverseDemo {
	
	public static String reverse(String s)
	{
		String name="";
		for(int i=s.length()-1;i>=0;i--)
		{
			name=name+s.charAt(i);
		}
		return name;
	}
	
	public static void main(String args[])
	{
		System.out.println(reverse("aki"));
	}

}
