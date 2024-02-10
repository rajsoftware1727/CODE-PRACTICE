import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invokemethods
{
	public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
	{
		Invokemethods invoke=new Invokemethods();
		Class c=invoke.getClass();
		Method m[]=c.getDeclaredMethods();
		for(Method n:m)
		{
			System.out.println(n.getName());
			if(n.getName().equalsIgnoreCase("sum"))
			{
				n.invoke(invoke);
			}
		}
	}
	
	public void sum()
	{
		int a=5,b=10;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=5,b=10;
		int c=a-b;
		System.out.println(c);

	}
}