import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	       String s=null;
	       int arr[]={10,20,30};
	        try{
	            //System.out.println(s.length());
	            System.out.println(arr[3]);
	        }
	     catch(ArrayIndexOutOfBoundsException e1){
	         //displaying exception by passing exception object
	         System.out.println("Exception index out of bound:"+e1);
	     }
	    catch(NullPointerException e2){
	        //displaying exception by passing nullpointer exception object
	     System.out.println("Exception null pointer"+e2);;   
	    }
	}
}
