#include<stdio.h>
main(){

int n,i=1,s=0;
printf("enter the limit of natural numbers ");
scanf("%d",&n);
while(i<=n)
{s=s+i*i;
i++;
 } 
 printf("%d",s);
}
