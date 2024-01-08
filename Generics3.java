class Main{
    public static void main(String args[]){
        CallingClass call=new CallingClass();
        call.<String>genericMethod("432 and 7853 are lucky number");
        call.<Integer>genericMethod(76);
        call.<Boolean>genericMethod(true);
        
    }
}
class CallingClass{
    public <T> void genericMethod(T data){
        System.out.praintln("generric method");
        System.out.println("data"+data);
    }
}
