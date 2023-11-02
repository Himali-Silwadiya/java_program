public class Testthrow
{public static void check(String s){
    if(s==null){
        throw new NullPointerException("it is null");
        
    }
    else{
        System.out.println("not null ");
    }
}
	public static void main(String[] args) {
		Testthrow obj=new Testthrow();
		obj.check(null);
		   System.out.println("rest of the code ");
	}
}
