//Implementation of thread using thead class
public class Main extends Thread
{
	public static void main(String[] args) {
	    Main thread=new Main();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	}
	public void run(){
		System.out.println("the code is running in a thread");
	}
}
