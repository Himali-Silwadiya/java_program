class Main{
    public static void main(String args[]){
        GenericClass<Integer> intObj=new GenericClass<>(5);
        System.out.println("generic class returns="+intObj.returnTheData());
        GenericClass<String> StringObj=new GenericClass<>("java programming");
        System.out.println("generic class returns="+StringObj.returnTheData());
    }
}
class GenericClass<T>{
    private T data;
    public GenericClass(T data){
        this.data=data;
    }
    public T returnTheData(){
        return this.data;
    }
}
