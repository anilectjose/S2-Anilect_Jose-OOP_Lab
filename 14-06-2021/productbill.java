
interface bill
{
	int productdetails();
}
class product1 implements bill{
		int id = 101,quantity= 2,unit=25,total=0;
		String name="A";
		
	public int productdetails()
	{
	total = quantity * unit;
		System.out.println("Product Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Quantity :"+quantity);
		System.out.println("Unit price :"+unit);
		System.out.println("Total :"+total);
		return(total);

	}
}
class product2 implements bill{
	int id = 102,quantity= 1,unit=100,total=0;
		String name="B";
		
	public int productdetails()
	{
		total = quantity * unit;
		System.out.println("Product Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Quantity :"+quantity);
		System.out.println("Unit price :"+unit);
		System.out.println("Total :"+total);
		return(total);

	}
}
public class productbill
{
	 public static void main(String[] args)
	 {
		 product1 p1 = new product1();
		 product2 p2 = new product2();
		int t1= p1.productdetails();
		int t2= p2.productdetails();
		int t3=t1+t2;
    
	System.out.println("Net. Amount :"+t3);	

	 }
}