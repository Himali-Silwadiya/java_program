public class Testthrow
{public static void check(int num){
    if(num<1){
        throw new ArithmeticException("number is negative cannot calculate square");
        
    }
    else{
        System.out.println("square of number is "+num*num);
    }
}
	public static void main(String[] args) {
		Testthrow obj=new Testthrow();
		obj.check(-3);
		   System.out.println("rest of the code ");
	}
}
