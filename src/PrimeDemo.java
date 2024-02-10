
public class PrimeDemo {
	
	public static void main(String args[])
	{
		int i=0;
		int n=10;
 		String prime=" ";
 		 
 		for(i=1;i<n;i++)
		{ 
			int count=0;

			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2||count==1)
			{
				prime=prime+i+" ";
 				
	 		}
 		}
		 System.out.println("Prime numbers are : "+prime);

	}
 
}
