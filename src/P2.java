import java.util.Scanner;

public class P2 {
	
	final String panNo;
	String name;
	String Address;
 	P2(String a1)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String cname=sc.next();
		System.out.println("Enter your Address");
		String caddress=sc.next();
		 
		String c1=String.valueOf(cname.charAt(2));
		String c2=String.valueOf(cname.charAt(5));
		 
	    String data=c1+c2;
	    a1=data;


 		 
 
		
  		panNo=a1;
  		System.out.println("this is your pan no "+panNo);
	}
	public void s()
	{
 	}
	public static void main(String args[])
	{
		P2 p=new P2("1");
		System.out.println(p.panNo);
		P2 p1=new P2("2");
		System.out.println(p.panNo);


		
	}

}
