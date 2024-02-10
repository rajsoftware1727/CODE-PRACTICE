
public class ArrayDemo {
	
	public static void main(String args[])
	{
		String d[][]=new String[2][1];
		d[0][0]="raj";
		d[1][0]="aki";
		//d[1][1]="aki1";
		for(String g[]:d)
		{
			for(String h:g)
			{
				System.out.println(h);

			}
 		}
		 
	}

}
