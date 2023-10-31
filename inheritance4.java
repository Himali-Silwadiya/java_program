class Animal
{
    public void Eat(){
        System.out.println("Eat in parent class");
    }
}
    class Dog extends Animal{
        public void Eat(){
            System.out.println("Eat in Subclass");
        }
    public void Bark(){
        System.out.println("Barking");
    }
    }
public class Main{
	public static void main(String[] args) {
	    Animal animal=new Animal();
	    animal.Eat();
	    Dog d= new Dog();
	    d.Eat();
	  
	}
}
