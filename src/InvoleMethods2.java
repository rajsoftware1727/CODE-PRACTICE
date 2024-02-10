import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvoleMethods2 {
	
	public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
	{
		InvoleMethods2 invoke=new InvoleMethods2();
		Class c=invoke.getClass();
		Method m[]=c.getMethods();
		for(Method g:m)
		{
 			if(g.getName().equalsIgnoreCase("sub"))
			{
				System.out.println(g.invoke(invoke));
				System.out.println(g);
 			}
 		}
		
	}
public static int sum()
{
	int a=10,b=5;
	int c=a+b;
	return c;
}
public static int sub()
{
	int a=10,b=5;
	int c=a-b;
	return c;
}
}
