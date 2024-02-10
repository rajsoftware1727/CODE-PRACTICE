
  class ExceptionDemo3 extends Throwable {
	
	String msg;
	
	ExceptionDemo3(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
	 

}
class ArithmaticDemo extends ExceptionDemo3
{

	ArithmaticDemo(String msg) {
		super(msg);
		
 	}
}

public class ExceptionDemo2
{
	public void display() throws ArithmaticDemo
	{
		 
		throw new ArithmaticDemo("cannot divide by zero");
		
	}
	
	public static void main(String args[])  
	{
		ExceptionDemo2 d=new ExceptionDemo2();
		try {
			d.display();
		} catch (ArithmaticDemo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}
}
