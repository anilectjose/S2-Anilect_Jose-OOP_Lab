import java.util.Scanner;
class Publisher {
String Pubname;
Publisher()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter publisher name");
Pubname=s.next();
}
}
class Book extends Publisher
{
String title, author;
int price;
Book()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Title of the book");
title=s.next();
System.out.println("Enter Author's name");
author=s.next();
System.out.println("Enter price");
price=s.nextInt();
}
}
class Literature extends Book
{
Literature()
{
System.out.println("Literature Books");
}
void display()
{
System.out.println("Publisher name: "+Pubname);
System.out.println("Title of the book: "+title);
System.out.println("Author's name: "+author);
System.out.println("Price: "+price);
}
}
class Fiction extends Literature
{
Fiction()
{
System.out.println("Friction Books");
}
void display()
{
super.display();
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the No of literature book: ");
int a=s.nextInt();
Literature L[]=new Literature[a];
for(int i=0;i<a;i++)
{
L[i]=new Literature();
}
System.out.println("Enter the No of Fiction book: ");
int b=s.nextInt();
Fiction F[]=new Fiction[b];
for(int i=0;i<b;i++)
{
F[i]=new Fiction();
}
int no;
System.out.println("Enter your choice of book");
no=s.nextInt();
int type =no;
switch (no)
{
case 1:
System.out.println(".....Details of literature books");
for(int i=0;i<a;i++)
L[i].display();
break;
case 2:
System.out.println(".....Details of fiction books");
for(int i=0;i<b;i++)
F[i].display();
break;
default:
System.out.println("Wrong input");
}
}
}