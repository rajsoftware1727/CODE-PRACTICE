public class Stuttering {
	public static String stutter(String word) {
		 char c1=word.charAt(0);
		 char c2=word.charAt(1);
		 return c1+c2+"..."+c1+c2+"..."+word+"?";
		 }
	
	
	public static void main(String args[])
	{
		System.out.println(Stuttering.stutter("raj"));
		 
		String name="raj";
		 char c1=name.charAt(0);
		 char c2=name.charAt(1);
		System.out.println(c1+" "+c2+"..."+c1+c2+"..."+name+"?");
	}
}