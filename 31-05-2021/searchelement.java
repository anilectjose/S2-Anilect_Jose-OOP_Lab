import java.util.*;
public class searchelement{
public static void main(String[] args)
{
int n,i,b,flag=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements for the array :");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of the array :");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the element u want to search :");
b=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==b)
{
flag=1;
break;		
}
else
{
	flag=0;
}
}
if(flag==1)
{
System.out.println("element found at position :"+(i+1));
}
else
{
	System.out.println("element not found");
}
}
}