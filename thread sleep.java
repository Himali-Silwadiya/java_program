import java.util.Scanner;
public class ThreadCount extends Thread
{
    ThreadCount(String s){
        super(s);
        System.out.println("New thread created"+this);
        start();
    }
	public void run(){
	    try{
	        for(int i=0;i<10;i++){
	            System.out.println("New thread created"+this);
	            Thread.sleep(1500);
	        }
	    }
	    catch(Exception e){
	    
		System.out.println("Currently executing thread is interrupted");
	}
		System.out.println("Currently executing thread is terminated");
	}
public static void main(String[] args)
{
    ThreadCount t1=new ThreadCount("t1");
    ThreadCount t2=new ThreadCount("t2");
}
}
