//Create an interface calculator
interface Calculator{
    public void Add(int a,int b);
    public void Subtract(double a,double b);
    public void Multiply(int i);
}
class A implements Calculator{
    public void Add(int a,int b){
        java.lang.System.out.println("Add is"+ (a+b));
    }
    public void Subtract(double a,double b){
        java.lang.System.out.println("Subtraction is"+ (a-b));
    }
public void Multiply(int i){
     java.lang.System.out.println("Multiplication is"+ i*i);
}
    public static void main(String[] args ){
        A a=new A();
        a.Add(2,5);
        a.Subtract(3.5,2.1);
        a.Multiply(4);
    }
}
