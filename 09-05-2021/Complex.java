public class Complex{
    double a, b;
    Complex(double r, double i){
     this.a = r;
     this.b = i;
    }
    public static Complex sum(Complex c1, Complex c2)
    {
         Complex temp = new Complex(0, 0);
 
         temp.a = c1.a + c2.a;
         temp.b = c1.b+ c2.b;
         return temp;
     }
     public static void main(String args[]) {
     Complex c1 = new Complex(5, 4);
     Complex c2 = new Complex(6, 3.5);
         Complex temp = sum(c1, c2);
         System.out.printf("Sum is: "+ temp.a+" + "+ temp.b +"i");
     }
 }