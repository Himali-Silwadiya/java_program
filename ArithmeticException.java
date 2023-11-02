import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    try{
	        Scanner sc=new Scanner(System.in);
	        int n;
	        System.out.println("Enter a number:");
	        n=sc.nextInt();
	        int divideByZero=5/n;
	        System.out.println("Rest of code in try block");
	    }
	    catch(ArithmeticException e){
	     System.out.println("ArithmeticException="+e.getMessage());   
	    }
	}
}
