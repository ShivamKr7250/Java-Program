package program1.java;

public class Exception_Handling {
	class exception_handling 
	{
	public static void main(String args[]) 
	{
	try 
	 {
	 System.out.print("Hello" + " " + 1 / 0);
	 }
	 catch(ArithmeticException e)
	 {
	 System.out.print("World"); 
	 }
	 }
	 }

}
