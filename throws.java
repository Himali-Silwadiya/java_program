public class Main
{public static void check(int age)throws ArithmeticException{
    if(age<18){
        throw new ArithmeticException("Acess denied -you must be at lest 18 years old");
        
    }
    else{
        System.out.println("acess granted- you are old enough ");
    }
}
	public static void main(String[] args) {
	check(15);
		   System.out.println("rest of the code ");
	}
}
