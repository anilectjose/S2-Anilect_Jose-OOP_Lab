import java.util.Scanner;
class Person
{
String name,gender,address;
int age;
public Person(String name, String gender, String address, int age) {
super();
this.name = name;
this.gender = gender;
this.address = address;
this.age = age;
}
}
class Employee extends Person {
int empid;
String company_name,qualification;
double salary;
public Employee(String name, String gender, String address, int age, int empid, String company_name,
String qualification, double salary) {
super(name, gender, address, age);
this.empid = empid;
this.company_name = company_name;
this.qualification = qualification;
this.salary = salary;
}
}
class Teacher extends Employee
{
String subject,department;
int teacherid;
public Teacher(String name, String gender, String address, int age, int empid, String company_name,
String qualification, double salary, String subject, String department, int teacherid) {
super(name, gender, address, age, empid, company_name, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherid = teacherid;
}
void display()
{
System.out.println("....Personal details...");
System.out.println(" Name : "+this.name+" Gender : "+this.gender+" Age :"+this.age);
System.out.println("...Employee details....");
System.out.println("Empid : "+this.empid +" company_name : "+this.company_name+" Salary : "+this.salary+" Address : "+this.address+" qualification : "+this.qualification);
System.out.println("...Teacher's details...");
System.out.println(" teacherid : "+this.teacherid+ " department : "+this.department+" Subjects : "+this.subject);
}
}
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter number of Teachers : ");
n=s.nextInt();
Teacher obj[]=new Teacher[n];
for(int i=0;i<n;i++) {
System.out.println("Enter the person name:");
String nam1=s.next();
System.out.println("Enter the Gender: ");
String gen1=s.next();
System.out.println("Enter the Address: ");
String adr1=s.next();
System.out.println("Enter the Age:");
int age1=s.nextInt();
System.out.println("Enter the Employee id: ");
int id1=s.nextInt();
System.out.println("Enter the Company name: ");
String cname1=s.next();
System.out.println("Enter the Salary:");
double sal1=s.nextDouble();
System.out.println("Enter the Qualification:");
String qu1=s.next();
System.out.println("Enter the Teacher id: ");
int tid1=s.nextInt();
System.out.println("Enter the Department:");
String dept1=s.next();
System.out.println("Enter the Subject:");
String sub1=s.next();
obj[i]=new Teacher(nam1,gen1,adr1,age1,id1,cname1,qu1,sal1,sub1,dept1,tid1);
}
System.out.println("\n-------------------------------------------------------------------------\n");
for(int i=0;i<n;i++) {
obj[i].display();
}
}
}