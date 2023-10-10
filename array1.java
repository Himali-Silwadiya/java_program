import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int [10];
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
		    System.out.println(a[j]+" ");
		}
	}
}
