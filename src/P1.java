
public class P1 {
	
	public static void main(String args[])
	{
		Bus b1=new Bus(100,"bharathi","bharu",false);
		Bus b2=new Bus(200,"rajesh","raj",true);
		System.out.println(b1.getbusNo());
		
		
	}
	
	
	
	
	
	
	
}
	
class Bus
{
	private Integer busNo;
	private String busName;
	private String driverName;
	private Boolean Ac;
	
	Bus(Integer busno,String busname,String dname,boolean ac)
	{
		this.busNo=busno;this.busName=busname;this.driverName=dname;this.Ac=ac;
	}
	
	public Integer  getbusNo()
	{
		return this.busNo;
	}
	
	public void   setbusNo(Integer n)
	{
		this.busNo=n;
	}
}



