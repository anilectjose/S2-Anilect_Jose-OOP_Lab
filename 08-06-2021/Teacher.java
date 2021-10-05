import java.util.*;
class Employee
 {
int empid;
String name,address;
double salary;
public Employee(int empid, String name, String address, double salary) {
this.empid = empid;
this.name = name;
this.address = address;
this.salary = salary;
}
}
public class Teacher extends Employee
{
String subject,department;
public Teacher(int empid, String name, String address, double salary,String department,String subject ) {
super(empid, name, address, salary);
this.subject = subject;
this.department = department;
}
void display()
{
System.out.println("Empid : "+this.empid+" Name : "+this.name+" Salary : "+this.salary+" Address : "+this.address+" department : "+this.department+" Subjects : "+this.subject);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter number of Teachers : ");
n=sc.nextInt();
Teacher obj[]=new Teacher[n];
for(int i=0;i<n;i++) {
int j = i+1;
System.out.print("Enter Empid of teacher "+j+" : ");
int Empid = sc.nextInt();
System.out.print("Enter Name of teacher "+j+" : ");
String Name = sc.next();
System.out.print("Enter Salary of teacher "+j+" : ");
double Salary = sc.nextDouble();
System.out.print("Enter Address of teacher "+j+" : ");
String Address = sc.next();
System.out.print("Enter department of teacher "+j+" : ");
String department =sc.next();
System.out.print("Enter Subjects of teacher "+j+" : ");
String Subjects =sc.next();
obj[i] = new Teacher(Empid, Name, Address, Salary, department, Subjects);
}
System.out.println("\n-------------------------------------------------------------------------\n");
System.out.println("Teacher's List \n");
for(int i=0;i<n;i++) {
obj[i].display();
}
}
}