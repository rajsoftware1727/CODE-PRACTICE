
public class PolyDemo1 {
	
	
	public static  String  poly(String s)
	{
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			    reverse=reverse+s.charAt(i);
		}
		return reverse;
	}
	public static void main(String args[])
	{
		String h=poly("rajesh");
		System.out.println(h);
	}

}
