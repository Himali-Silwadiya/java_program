import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        try{
	            int x=10/0;
	        }
	     catch(ArithmeticException err)//Execution err    {
	     {
	         System.out.println("ArithmeticException="+err.getMessage());
	     }
	     finally{
	         System.out.println("This is the final block");
	     }
	}
}
