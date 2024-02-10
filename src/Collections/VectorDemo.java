package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public interface VectorDemo {
	
	public static void main(String args[])
	{
		Vector<String> v=new Vector<String>();
		v.add("rajesh");
		v.add("akila");
		v.add("thrishiv");
		 
      Collection c=new Vector();
      c.add("String");
      c.add(5);
      c.add('c');
      System.out.println(c.size());
 		//using iteartor to remove 
 		/* Iterator<String> i=v.iterator();
 		 while(i.hasNext())
 		 {
 			 String g=i.next();
 			 if(g.startsWith("r"))
 			 {
 				 i.remove();
 			 }
  		 }*/
		
		v.removeIf(n -> (n.charAt(0)=='r'));
 		 
 		 for(String h:v)
 		 {
 			 System.out.println(h);
 		 }
 		 
 		 Vector<Integer> v1=new Vector<Integer>();
 		 for(int i=1;i<20;i++)
 		 {
 			 v1.add(i);
 		 }
 		  System.out.println(v1);
 		  Predicate<Integer> pre=a-> (a%2==0);
 		  v1.removeIf(pre);
 		  System.out.println(v1);
 	}

}
