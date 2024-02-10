
public class Student {
	
	int age;
	String name;
	
	public void details(int age,String name)
	{
		this.age=age;this.name=name;
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.details(5,"raj");
		System.out.println(s.age);
	}

}
