package Interview;

public interface Animal {
	
	public void sound();
	public void color();
	public class Dog implements Animal
	{

		@Override
		public void sound() {
			// TODO Auto-generated method stub
			
			System.out.println("bow bow");
			
		}

		@Override
		public void color() {
			// TODO Auto-generated method stub
			System.out.println("white");
		}
		public class Lion implements Animal
		{

			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("zzzzz");
			}

			@Override
			public void color() {
				// TODO Auto-generated method stub
				System.out.println("yellow");
			}
			
		}
		
		 
		
		
		
	}
	
	public class Main
	{
		public static void main(String args[])
		{
			Dog d=new Dog();
			d.sound();
			d.color();
		}
	}

}

 

 
