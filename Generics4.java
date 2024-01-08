class Main{
    public static void main(String args[]){
        CallingClass call=new CallingClass();
        call.<String,Integer>genericMethod("432 and 7853 are lucky number",5);
        
        
    }
}
class CallingClass{
    public <T,V> void genericMethod(T data,V data1){
        System.out.println("generric method");
        System.out.println(" data "+data+" data2 "+data1);
    }
}
