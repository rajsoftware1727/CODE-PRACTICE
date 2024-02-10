class A
{
	public void Run()
	{
		System.out.println("running");
	}
	 int speed=60;
}
class M extends A
{
	public void Run()
	{
		System.out.println("running with 60km/h");
	}
	int speed=80;
}
public class PolyDemo {
	
	public static void main(String args[])
	{
		A a=new A();
		a.Run();
		M b=new M();
		b.Run();
		A a1=new M();
		a1.Run();
		System.out.println(a.speed);
		System.out.println(b.speed);
		System.out.println(a1.speed);
	}

}
