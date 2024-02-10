
public class ExceptionDemo {
	static int a;
	public static void main(String args[])
	{
		try
		{
			  a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
			System.out.println(a);

 		}
 
		System.out.println("all codes ");
	}

}
