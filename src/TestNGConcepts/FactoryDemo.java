package TestNGConcepts;

import org.testng.annotations.Factory;

public class FactoryDemo {
	
	@Factory
	public Object[] FactoryDemo()
	{
		Object test[]=new Object[2];
		test[0]=new F1();
		test[1]=new F2();
		return test;
		 
	}

}
