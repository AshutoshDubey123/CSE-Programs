class Box
{
double width;
double height;
double depth;
void setDataRect()
{
width =10; 
height=15; 
depth=20;
}

void setDataCube()
{
width =10; 
height=10; 
depth=10;
}
double calcVol()
{
double v=width*height*depth;
return v;
}
}
class Vol
{
public static void main(String args[])
{
Box rect=new Box();
Box cube=new Box();
double v1,v2;

rect.setDataRect();
v1=rect.calcVol();
System.out.println("volume of the rectangular box is:"+v1);

cube.setDataCube();
v2=cube.calcVol();
System.out.println("volume of the cubical box is:"+v2);
if(v1>v2)
System.out.println("volume of the rectangular box is greater");
else if(v1<v2)
System.out.println("volume of the cubical box is greater");
else 
System.out.println("volume of both is same");


}
}