

public class PrimeNumberDemo {
	
	public static void main(String args[])
	{
		//print prime numbers
		String primenumber="";
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;
				}
			}
				if(count==2)
				{
					primenumber=primenumber+i+"  ";
				}
			
			
		}
		 System.out.println("Prime numbers are : "+primenumber);
 	}

}
