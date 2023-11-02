import java.util.Scanner;
public class Table implements Runnable
{
	public static void main(String[] args) {
	    Table thread1=new Table();
	    Thread t1=new Thread(thread1);
	    Table thread2=new Table();
	    Thread t2=new Thread(thread2);
	     t1.start();
	    t2.start();
	   
	    System.out.println("This code is outside of the thread");
	}
	public void run(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value of n");
	    int n=sc.nextInt();
	    for(int i=1;i<=10;i++)
	    
		System.out.println(n+"*"+i+"="+n*i);
	}
}
