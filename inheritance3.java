
 class Animal
{
    public int legcount;
    protected void Display(){
    System.out.println("I am an animal");
    System.out.println("I have"+legcount+"legs");
    
    }
}
public class Main{
	public static void main(String[] args) {
	    Animal animal=new Animal();
	    animal.legcount=4;
	    animal.Display();
	  
	}
}
