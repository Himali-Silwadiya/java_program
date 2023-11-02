class FinalDemo{
    public void display()
    {
        System.out.println("This is a final method");
    }
}
class Main extends FinalDemo{
    public final void display(){
        System.out.println("The final method is overridden");
    }
    public static void main(String args[]){
        Main m=new Main();
        m.display();
    } 
}
