import java.util.Scanner;
 class product {//data members
 int pcode;
 String pname;
 double price;
 //default constructer
product (){
pcode=0;
pname="unkown";
price=0;
}
//parameteized consterct
product (int c,String n, double p){
pcode=c;
pname=n;
price=p;
}
//method to display
void display(){
System.out.println(pcode +"\t" + pname + "\t" + price);
}
}
public class productmain{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
product p1=new product(101,"Laptop",45000.00);
System.out.println("Enter details for product 2:");
System.out.print("product code :");
int c2=sc.nextInt();
sc.nextLine();
System.out.println("product Name:");
String n2=sc.nextLine();
System.out.print("price :");
double pr2=sc.nextDouble();
product p2=new product(c2,n2,pr2);
System.out.println("enter details for product 3:");
product p3=new product();
System.out.print("product code:");
p3.pcode=sc.nextInt();
sc.nextLine();
System.out.print("product Name:");
p3.pname=sc.nextLine();
System.out.print("price:");
p3.price=sc.nextDouble();
System.out.println("\n----product with lower price---");
product low=p1;
if(p2.price<low.price){
low=p2;
}
if(p3.price<low.price){
low=p3;
}
System.out.println("code \t Name \t price");
low.display();
}
}

