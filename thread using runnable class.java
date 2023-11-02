//Implementation of thread using Runnable class
public class Main implements Runnable
{
	public static void main(String[] args) {
	    Main thread=new Main();
	    Thread t=new Thread(thread);
	    t.start();
	    System.out.println("This code is outside of the thread");
	}
	public void run(){
		System.out.println("the code is running in a thread");
	}
}
