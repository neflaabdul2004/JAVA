import java.util.Scanner;
class Complex{
double real;
double image;

Complex(){
real=0;
image=0;
}
Complex(double r,double i){
real=r;
image=i;
}
Complex add(Complex c2){
Complex result=new Complex();
result.real=real + c2.real;
result.image= image + c2.image;
return result;
}
Complex mult(Complex c2){
Complex result=new Complex();
result.real=(real+c2.real)-(image*c2.image);
result.image=(real*c2.image)+(image*c2.real);
return result;
}
Complex sub(Complex c2){
Complex result=new Complex();
result.real=real - c2.real;
result.image= image - c2.image;
return result;
}
void display(){
System.out.println(real+"+"+image+"i");
}
}
class Complexmain{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enert the real part:");
Double r1=sc.nextDouble();
sc.nextLine();
System.out.println("Enert the imaginary part:");
Double i1=sc.nextDouble();
sc.nextLine();
System.out.println("Enert the second real part:");
Double r2=sc.nextDouble();
sc.nextLine();
System.out.println("Enert the imaginary part:");
Double i2=sc.nextDouble();
sc.nextLine();

Complex c1=new Complex(r1,i1);
Complex c2=new Complex(r2,i2);
System.out.println("\n----Result---");
Complex sum=c1.add(c2);
Complex diff=c1.sub(c2);
Complex prod=c1.mult(c2);
System.out.print("sum=  ");
sum.display();
System.out.print("Diffrence=  ");
diff.display();
System.out.print("product=  ");
prod.display();
}
}





