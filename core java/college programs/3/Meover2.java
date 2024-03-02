//Demonstrate method oveloading with a suitable example involving implicit type casting
class Calculator
{
int add (int a, int b)
{
return a+b;
}

double add (double a, double b)
{
return a+b;
}

double add (int a, double b)
{
return a+b;
}
}


class Meover{

public static void main(String[] args) 
{
Calculator c = new Calculator();

int result1 = c.add(10,20);
System.out.println("The sum of 10 & 20 is "+result1);

double result2 = c.add(10.5,20.5);
System.out.println("The sum of 10.5 & 20.5 is "+result2);

double result3 = c.add(10,20.5);//int convrted to double to perform addition
System.out.println("The sum of 10 & 20.5 is "+result3);
}
          }


