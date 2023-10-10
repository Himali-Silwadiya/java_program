import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[]={1,2,3,5,7};
	    int sum=0;
	    double avg;
	    Scanner sc=new Scanner(System.in);
		for(int i :a)//for each loop
		{
		    sum+=i;
		}
		avg=sum/5.0;
		System.out.println("Sum is"+sum);
		System.out.println("Avg is"+avg);
	}
}
