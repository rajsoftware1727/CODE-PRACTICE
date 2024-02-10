package TestNGConcepts;

import org.testng.annotations.Factory;

public class FactoryDemo3 {
	
	
	public class Factory1
	{
		@Factory
		public Object[] test()
		{
			/*Object t[]=new Object[1];
	 		t[0]=new FactoryDemo2(5);
			return t;*/
			return new Object[]{new FactoryDemo2(5)};

	 
		}
	}

}
