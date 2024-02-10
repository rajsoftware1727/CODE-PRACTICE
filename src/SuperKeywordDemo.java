

class Animal
{
	String color="red";
	
	public void color()
	{
		System.out.println(color);
		System.out.println("animal");
	}
	
	Animal()
	{
		System.out.println("animal constructor");
	}
	
}
class Dog extends Animal
{
	String color="black";
	
	Dog()
	{
		System.out.println("dog class constructor");
	}
	public void color()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.color();
	}
}

public class SuperKeywordDemo {
	
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.color();
  		}
	
	

}
