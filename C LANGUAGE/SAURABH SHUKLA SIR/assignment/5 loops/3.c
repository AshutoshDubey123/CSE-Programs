#include<stdio.h>
main(){

int n,i=1,s=0;
printf("enter the no. of first odd natural numbers");
scanf("%d",&n);
while(i<=n)
{s=s+2*i-1;
i++;
 } 
 printf("%d",s);
}
