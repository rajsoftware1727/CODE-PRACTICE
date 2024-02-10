package SeleniumConceptsPracticeDemo;

import org.apache.xmlbeans.impl.util.Base64;

public class EncodeAndDecode_2 {
	public static void main(String args[])
	{
		String s="Rajesh@123";
		byte bytes[]=s.getBytes();
		 byte a[]=Base64.encode(bytes);
		 String encodeString=new String(a);
		 System.out.println(encodeString);
		 byte h[]=Base64.decode(a);
		 String decodeString=new String(h);
		 System.out.println(decodeString);
		 
 		 
		/*for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ASCII value is "+(int)c);
			System.out.println();
		}*/
		
	}

}
