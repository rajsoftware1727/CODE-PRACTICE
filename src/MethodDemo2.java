import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo2 {
	
	public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
	{
		MethodDemo2 n=new MethodDemo2();
		Class s=n.getClass();
		Method f[]=s.getMethods();
		for(Method g:f)
		{
			if(g.getName().equals("t3"))
			{
				g.invoke(n);
				System.out.println(g);
 			}
		}
	}

	
	public void t1()
	{
		System.out.println("t1");
	}
	public void t2()
	{
		System.out.println("t2");
	}
	public void t3()
	{
		System.out.println("t3");
	}
}
