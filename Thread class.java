//Create 4 classes 
class A
{
    public static void func(int n1,int n2,int n3){
        if(n3==0){
        for(int i=n1;i<n2;i++)
        {
            if(i%2==0)
            System.out.println(i);
    }}
    else{
    for(int i=n1;i<n2;i++)
    {
        if(i%2!=0)
        System.out.println(i);
    }
    }
    }
}
class B extends Thread{
    
    public void run()
    {
    A.func(1,20,0);
}
}
class C extends Thread{
    public void run()
    {
       
        A.func(1,20,1);
    }
}

public class D{
	public static void main(String[] args) {
		B b =new B();
		b.start();
		C c=new C();
		c.start();
	}
}
