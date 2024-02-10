package InterviewDemo_java;

import org.testng.annotations.Test;

public class InheritedDependentOnTestNG {
	
	 
	@Test()
			public void Openbrowser()
			{
				System.out.println("browser opened");
			}
			
	

}

class Child extends InheritedDependentOnTestNG
{
	 
	@Test(dependsOnMethods= {"Openbrowser"})
	public void Sigin()
	{
		System.out.println("sign in");
	}
}
