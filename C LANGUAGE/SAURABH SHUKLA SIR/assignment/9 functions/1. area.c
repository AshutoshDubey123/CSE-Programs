#include<stdio.h>
#include<conio.h>
float area(float);
main()
{float r;
float a;
printf("enter the radius of circle");
scanf("%f",&r);
a=area(r);
printf("area is %f",a);
getch();
}
 float area(float r)
{float c;
c=3.14*r*r;
return c;
}

