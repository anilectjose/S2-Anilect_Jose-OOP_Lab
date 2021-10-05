public class shape
{
int side,as,ar;
public void area(int a)//area of square

{
side=a;
as=a*a;
System.out.println("area of square is"+as);
}
public void area(double r)//area of circle
{
double radi=r;
double ac=(22/7)*radi*radi;
System.out.println("area of circle is"+ac);
}
public void area(int l,int w)//area of rectangle
{
int len=l;
int wid=w;
ar=len*wid;
System.out.println("area of rectangle"+ar);
}
public void area(int h,double r)//area of cylinder
{
int he=h;
double rad=r;
double acy=(2*(22/7)*rad*he)+((22/7)*rad*rad);
System.out.println("area of cylinder"+acy);	

}
public static void main(String[] args)
{
shape s=new shape();
s.area(4);//area of square	
s.area(5.52);//area of circle
s.area(5,4);//area of rectangle	
s.area(5,4.5);	//area of cylinder
}
}
