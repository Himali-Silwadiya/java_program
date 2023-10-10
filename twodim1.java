import java.util.Scanner;
import java.util.*;
public class TwoDimen
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int [][] a=new int[4][3];
	    int i,j;
	    System.out.println("Enter array elements");
		for(i=0;i<4;i++)
		{
		    for(j=0;j<3;j++)
		    {
		      a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Two Dimensional array elements are:");
		for(i=0;i<4;i++)
		{
		    for(j=0;j<3;j++)
		    {
		      System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
