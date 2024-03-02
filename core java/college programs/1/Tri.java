import java.util.Scanner;
class Tri
{
public static void main(String args[])
{Scanner sc=new Scanner (System.in);
System.out.println("enter the sides of triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int peri=a+b+c;
int s=(a+b+c)/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("perimeter is"+peri +" and area is"+area);

}
}


