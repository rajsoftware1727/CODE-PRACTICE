import org.testng.annotations.Test;

public class DirDemo {
	
	
	@Test
	public void printDirectoryPath()
	{
		 String s=new String(System.getProperty("user.dir")+"/test-output/ownreport.html");
		 System.out.println(s);
 
	}

}
