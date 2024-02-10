
public class FibonacciDemo {
	
	public static String fibonacci(int n)
	{
		int first=0;
		int second=1;
		String fibo=first+" "+second+" ";
		for(int i=1;i<n;i++)
		{
			int third=first+second;
			first=second;
			second=third;
			fibo=fibo+third+" ";
		}
		return fibo;
	}
	
	public static void main(String args[])
	{
		String g=fibonacci(10);
		System.out.println(g);
	}

}
