
public class Employee {

	private String name;
	private int salary;
	public String getename()
	{
		return name;
	}
	
	public void setename(String name)
	{
		this.name=name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int s)
	{
		this.salary=s;
	}
	public void display()
	{
		System.out.println("Employee name is :"+name+" "+"Salary is :"+salary);
	}
	 
;	Employee(String n,int s)
	{
		this.name=n;this.salary=s;
	}
	
	public static void main(String args[])
	{
		Employee e1=new Employee("raj",1000);
		System.out.println(e1.getSalary());
		Manager m1=new Manager("akila",20000,5000);
		System.out.println(m1.getSalary());
		Employee r=new Manager("Rajesh",20000,5000);
		System.out.println("The manager name is :"+r.getename()+"salary is : "+r.getSalary());
		e1.display();
		m1.display();
		
	}
	
}	  
	
	
	class Manager extends Employee
	{
		private int Bonus;
		Manager(String n,int s,int b)
		{
			super(n,s);
			this.Bonus=b;
		}
		public int getSalary()
		{
			 return super.getSalary()+Bonus;
		}
		public void display()
		{
			super.display();
			System.out.print("bonus is "+" "+Bonus);
		}
		
	}


