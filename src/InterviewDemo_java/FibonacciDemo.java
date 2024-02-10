package InterviewDemo_java;

public class FibonacciDemo {
	
	public static void main(String args[])
	{
		 int first=1,second=1;
		 int third;
		 System.out.print(first+" "+second+" ");

		 for(int i=1;i<=5;i++)
		 {
			 third=first+second;
             System.out.print(third+" ");
  			 first=second;
 			 second=third;
			 
		 }
	}

}
