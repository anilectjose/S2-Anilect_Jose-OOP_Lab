import java.util.Scanner;
interface Shape
{
    void input();
    void area();
    void perimeter();
}
class Circle implements Shape
{

    int r = 0;
    double pi = 3.14, ar = 0,per=0;
    public void input()
    {        Scanner s = new Scanner(System.in); 
	     System.out.print("Enter radius of circle:");
             r= s.nextInt();
    }
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
    public void  perimeter()
    {
	    per = 2 * pi * r;
	    System.out.println("Perimeter of circle:"+per);
    }

}
class Rectangle implements Shape
{
    int l = 0, b = 0;
    double ar,per;
    public void input()
    {    Scanner s = new Scanner(System.in); 
	 System.out.print("Enter length of rectangle:");
        l = s.nextInt();
         System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
    }
    public void area()
    {
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter()
    {
	      per = 2 * (l + b);
	      System.out.println("Perimeter of rectangle:"+per);
    }
}
public class shapes
{
    public static void main(String[] args)
    { int n;
	Scanner s = new Scanner(System.in); 
        Rectangle obj1 = new Rectangle();
	Circle obj2 = new Circle();

	System.out.println("1.Area of circle");
	System.out.println("2.Perimeter of circle");
	System.out.println("3.Area of rectangle");
	System.out.println("4.Perimeter of rectangle");
     	System.out.println("Enter your option:");
             n= s.nextInt();
	switch(n) {
         case 1:
            obj2.input();
	    obj2.area();
         break;
         case 2:
            obj2.input();
	    obj2.perimeter();
         break;
	  case 3:
            obj1.input();
	    obj1.area();
         break;
         case 4:
            obj1.input();
	    obj1.perimeter();
         break;
         default:
          System.out.println("Invalid option");
}

    }
}