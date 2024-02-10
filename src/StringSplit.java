
public class StringSplit {
	
	public static void main(String args[])
	{
		/*String dob="15-08/1990";
		String dd=dob.split("-")[0];
		String mmyyyy=dob.split("-")[1];
 		String mm=mmyyyy.split("/")[0];
 		String yyyy=dob.split("/")[1];
		System.out.println("Date is -----"+dd+"-----month is -------"+mm+"-------year is --------"+yyyy);*/
		String dob1="15-08-1990";
		String dd1=dob1.split("-")[0];
		String mm2=dob1.split("-")[1];
		//System.out.println(dd1+"  "+mm2);
		String n[]=dob1.split("-",3);
		for(String i:n)
		{
			System.out.println(i);
		}
 		
		 
	}

}
