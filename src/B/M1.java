package B;

public class M1 implements M,M2 {

	@Override
	public void run() {
 		System.out.println("running");
	} 
	
	public static void main(String args[])
	{
		M1 m=new M1();
		m.run();
	}

}
