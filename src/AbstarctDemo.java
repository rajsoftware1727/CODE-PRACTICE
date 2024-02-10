
 public  class AbstarctDemo {
	
	public static void main(String args[])
	{
 	}
  
	  abstract class A
	{
		public abstract void animalSound();
		
		public void animalSound1()
		{
			System.out.println("zooooo");
		}
	}
	
	class Cat extends A
	{
		 public void animalSound()
		 {
			 System.out.println("boooo");
		 }
	}
}
