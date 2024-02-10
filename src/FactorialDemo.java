
public class FactorialDemo {
	
	
	public static int fact(int i)
	{
		 if(i==0)
		 {
			 return 1;
		 }
		 else
		 {
			 return i*fact(i-1);
		 }
		 
 	}
	public static void main(String args[])
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("fact of "+i+" is "+FactorialDemo.fact(i));

		}
 	}

}
