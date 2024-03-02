class Box
{
double width;
double height;
double depth;


Box(double w,double h,double d)
{
width =w;
height=h;
depth=d;
}

double vol()
{
return width*height*depth;
}


 
}

class Box_parameterized
{
public static void main(String args[])
{

Box rect=new Box(10,15,20);
Box cube=new Box(10,10,10);

double v1=rect.vol();
System.out.println("rectangular volume is "+v1);

double v2=cube.vol();
System.out.println("cubical volume is "+v2);

if(v1>v2)
System.out.println("volume of the rectangular box is greater");
else if(v1<v2)
System.out.println("volume of the cubical box is greater");
else 
System.out.println("volume of both is same");


}
}

