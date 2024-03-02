//fuxn to calculate circumference of circle
#include<stdio.h>
float circum(float);
  main()
{float r;
float c;
printf("enter the radius of circle ");
scanf("%f",&r);
c=circum(r);
printf("circumference of circle is %f",c);
}
float circum(float x)
{float a;
a=2*3.14*x;
return a;
}

