interface solution{
    public void Hello();
    public void Welcome();
    public void Display(int i);
}
public class A implements solution{
    public void Hello(){
        java.lang.System.out.println("Hello World");
    }
    public void Welcome(){
        java.lang.System.out.println("Welcome to Edureka");
    }
public void Display(int i){
     java.lang.System.out.println(i);
}
    public static void main(String[] args ){
        A a=new A();
        a.Hello();
        a.Welcome();
        a.Display(4);
    }
}
