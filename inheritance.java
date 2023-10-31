 class Data
{
    private String name;
    public void set(String n){
    name=n;
    }
    public void get(){
        System.out.println("The String is:"+name);
    }
}
public class Main{
	public static void main(String[] args) {
	    Data d=new Data();
	    d.set("Hello World");
	    d.get();
	}
}
