import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        try{
	            
	      int  n=Integer.parseInt(sc.nextLine());

	      if(99%n==0)
	      System.out.println(n+"is a factor of 99");}
	    catch(ArithmeticException e){
	     System.out.println("ArithmeticException="+e.getMessage());   
	    }
	    catch(NumberFormatException e)
	    {
	        System.out.println("Number format exception"+e.getMessage());
	    }
	}
}
