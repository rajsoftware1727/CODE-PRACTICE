package Hook;

 
 
public class ThreadDemo extends Thread {
	
	//create thread by using extending the above class by thread class
	
	public void run()
	{
		System.out.println("I am running "+Thread.currentThread());
	}


	
		public static void main(String args[])
		{
			int n=8;
			ThreadDemo v=new ThreadDemo();
			for(int i=0;i<n;i++)
			{
				v.start();
			}
		}
	}

	 



 

 
