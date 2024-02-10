import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {
	
	
	public void sum()
	{
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=5;
		int b=10;
		int c=a-b;
		System.out.println(c);
		
	}
	public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
	{
		MethodDemo1 m=new MethodDemo1();
		Class demo=m.getClass();
		Method f[]=demo.getMethods();
		for(Method d:f)
		{
			 if(d.getName().equalsIgnoreCase("sum"))
			 {
				 d.invoke(m);
			 }
 		}
			
			
				
	}

}
