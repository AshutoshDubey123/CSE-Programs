#include<stdio.h>
#include<math.h>
main(){
float a,b,c,d,deno,r1,r2;
printf("enter a,b,c");
scanf("%f%f%f",&a,&b,&c);
d=(b*b)-(4*a*c);
deno=2*a;
if(a==0)
printf("roots don't exist");

else


if(d>0)
{printf("real roots");
r1=(-b+ sqrt(d))/deno;
r2=(-b-sqrt(d))/deno;
printf("%d,%d",r1,r2);}
else

if(d==0)
{printf("equal roots");
r1=-b/deno;
printf("%f,%f",r1,r1);
}else
printf("imagnary roots");




}
