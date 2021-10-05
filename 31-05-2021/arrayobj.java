public class arrayobj{
public static void main(String[] args) 
{
product[] o=new product[5];
o[0]=new product(12,"Soap");
o[1]=new product(14,"Gel");
o[2]=new product(17,"Handwash");
o[3]=new product(21,"Santizier");
o[4]=new product(23,"Mask");
System.out.println("The product details are : ");
int n=5;
for(int i=0;i<n;i++)
{
o[i].display();
}
}
}
class product
{
int pro_price;
String pro_name;
product(int pr,String name)
{
pro_price=pr;
pro_name=name;
}
public void  display(){
System.out.println(" Product price is : "+ pro_price+"   Product name : "+ pro_name);
}
}

