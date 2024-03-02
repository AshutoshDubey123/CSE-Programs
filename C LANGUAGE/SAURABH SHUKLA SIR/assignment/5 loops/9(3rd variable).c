#include<stdio.h>
main()
{
int n,a=-1,b=1,i=1,c;
printf("enter the no.of terms:");
scanf("%d",&n);
while(i<=n){

c=a+b;
printf("%d ",c);

a=b;
b=c;
i++;}
}
