class Box
{
double width;
double height;
double depth;
double side;

Box()
{
width =10;
height=15;
depth=20;
side =10;
}

double volr()
{
return width*height*depth;
}

double volc()
{
return side*side*side;
}
 
}

class BoxDemo
{
public static void main(String args[])
{

Box rect=new Box();
Box cube=new Box();

double v1=rect.volr();
System.out.println("rectangular volume is "+v1);

double v2=cube.volc();
System.out.println("cubical volume is "+v2);

if(v1>v2)
System.out.println("volume of the rectangular box is greater");
else if(v1<v2)
System.out.println("volume of the cubical box is greater");
else 
System.out.println("volume of both is same");


}
}

