
public class FactDemo {
	
	public static int fact(int n)
	{
		 if(n==0)
		 {
			 return 1;
		 }
		 else
		 {
			 return n*fact(n-1);
		 }
	}
 public static void main(String args[])
 {
	 for(int i=1;i<=5;i++)
	 {
		 int t=fact(i);
		 System.out.println("factorial of "+" "+ i+" is "+t);
	 }
  }
}
