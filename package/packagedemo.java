import java.util.Scanner;
import mathutils.Calculater;

public class packagedemo{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
Calculater calc = new Calculater();
System.out.println("enter the first oprater:");
double n=sc.nextDouble();
System.out.println("enter the second oprater:");
double m=sc.nextDouble();

System.out.println("-------Result---------");
System.out.println("Addition  :"+calc.addition(n,m));
System.out.println("Subtraction  :"+calc.subtraction(n,m));
System.out.println("Multiplication  :"+calc.multiplication(n,m));
if(m==0){
System.out.print("cannot divideby zero");

}
System.out.println("Division  :"+calc.division(n,m));
}
}

