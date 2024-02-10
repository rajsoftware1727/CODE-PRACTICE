
class Vote1 extends Exception
{
	Vote1(String msg)
	{
		super(msg);
	}
	
}
class Vote
{
 	 public void givenAge(int givenAge) throws Vote1
	 {
		 if(givenAge<18)
		 {
			 throw new Vote1("you are not allowed to vote");
		 }
		 else
		 {
			 System.out.println("you are allowed to vote");
		 }
	 }
 	 
 	 public static void main(String args[]) throws Vote1
 	 {
 		 Vote v=new Vote();
 		 v.givenAge(15);
 		  
 	 }
 	 
 	 
}
 

 
