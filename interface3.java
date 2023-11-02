interface Machine{
    public void start();
    public void stop();
}
class Waterpump implements Machine{
public void start()
{
    System.out.println("Starting Waterpump");
}
    public void stop(){
        System.out.println("Stopping Waterpump");
    }
    }
class Testing{
    public static void main(String[] args ){
        Machine m=new Waterpump();
        paint(new Waterpump());
}
public static void paint(Machine m)
{
    m.start();
    m.stop();
    System.out.println("Painting...");
    
}
}
