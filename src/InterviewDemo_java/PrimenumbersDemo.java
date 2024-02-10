package InterviewDemo_java;

public class PrimenumbersDemo {
	
	public static void main(String args[])
	{
 		 String primeno="";
		for(int i=1;i<100;i++)
		{
			 int count=0;

			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
		
		if(count==2)
		{
			primeno=primeno+i+" ";
 		}
		}
		System.out.println("prime numbers are : "+primeno);


}
}
