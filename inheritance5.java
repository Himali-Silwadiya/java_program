class Shape
{
    public void Area(){
        System.out.println("Area of different Shapes!");
    }
}
    class Circle extends Shape{
        int r;
        double pi;
        public void Area(int r,double pi){
            System.out.println("Area of Circle:"+2*pi*r);
        }
    }
 class Rectangle extends Shape{
     int l,b;
     public void Area(int l,int b)
     {
         System.out.println("Area of Rectangle"+l*b);
     }
 }  
public class Main{
	public static void main(String[] args) {
	    Shape s=new Shape();
	    s.Area();
	    Circle c= new Circle();
	    c.Area(3,3.14);
	    Rectangle r=new Rectangle();
	    r.Area(3,4);
	  
	}
}
