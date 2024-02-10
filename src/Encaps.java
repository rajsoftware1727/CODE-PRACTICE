
public class Encaps {
	
	
	 
	
	public static void main(String args[])
	{
		Bike b=new Bike();
		b.Run();
		Splendor s=new Splendor();
		s.Run();
		Bike b1=new Splendor();
		b1.Run();
		
	}
	
	

}

class Bike
{
	public void Run()
	{
		System.out.println("running");
	}
}
class Splendor extends Bike
{
	public void Run()
	{
		System.out.println("running with 60km/h");
	}
}
