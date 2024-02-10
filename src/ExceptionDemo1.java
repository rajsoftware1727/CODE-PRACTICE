
public class ExceptionDemo1 {
	
	public static void main(String args[])
	{
		try
		{
			int a=5/0;
			System.out.println(a);
		}
		 
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			
		}
		finally
		{
			System.out.println("exception is handled or not am executed");
		}
		
				
	}

}
