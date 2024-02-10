import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ForEachLoopUsingForArray {
	
	public static void main(String args[])
	{
		/*List<String> l=new ArrayList<String>();
		l.add(new String("Rajesh"));
		l.add("Akila");
		l.add("Thrishiv");
		String s1=new String("raj");
		System.out.println(s1);
		
		System.out.println(l);
		for(String s:l)
		{
			String data=s.toString();
			System.out.println(data);
		}*/
		
		String d="raj.xlsx.hai";
		System.out.println(d.substring(3));
		System.out.println(d.indexOf(".x"));
 		String s[][][]= {{{"raj1","raj2","raj3"},{"Akila1","Akila2","Akila3" },{"A1","A2","A3"}}};
		 
		for(String g[][]:s)
		{
			for(String v[]:g)
			{
				for(String k:v)
				{
					String data=k.toString();
					System.out.println(data);
				}
			}
		}
		 
	}
	
 	
	
	
}
		
		
		
 		
	


