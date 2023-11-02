class Main{
    int sum;
    Main(){
        this(5,2);
    }
    Main(int a1,int a2){
        this.sum=a1+a2;
    }
    void display()
    {
        System.out.println("Sum is"+sum);
    }
    public static void main(String args[]){
        Main m=new Main();
        m.display();
    } 
}
