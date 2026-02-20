import java.util.Scanner;
class  Geometry{
double area (double r){
return Math.PI*r*r;
}
double area(double length,double breadth){
return  length*breadth;

}
double area(double a ,double b,double c){
if((a+b <=c) |(a+c <=b) |(b+c <= a)){
System.out.println( "invalid trainglesides! Triangle inequality violated.");
return 0.0;
}
double s= (a+b+c)/2;
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
}





public class MethodOverL{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
Geometry geo = new Geometry();


System.out.println("--- Method Overloading:Area calculation---\n");


System.out.print("Enter radius of the Circle: ");
double m = sc.nextDouble();

double circleArea = geo.area(m);
System.out.println("Area of Circle = " + circleArea);




System.out.print("\nenter length and breadth of Rectangle:");
double l=sc.nextDouble();
double b=sc.nextDouble();
System.out.println("area of rectangle:"+geo.area(l,b));





System.out.print("\n Enter three sides of triangle (a,b,c):");
double sideA=sc.nextDouble();
double sideB=sc.nextDouble();
double sideC=sc.nextDouble();

double triangleArea = geo.area(sideA, sideB, sideC);
System.out.println("Area of Triangle = " + triangleArea);

        sc.close();
    }
}
