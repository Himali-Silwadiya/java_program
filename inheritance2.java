 class Animal
{
    protected void Display(){
    System.out.println("I am an animal");
    }
}
class Dog extends Animal{
	public static void main(String[] args) {
	    Dog d=new Dog();
	    d.Display();
	  
	}
}
