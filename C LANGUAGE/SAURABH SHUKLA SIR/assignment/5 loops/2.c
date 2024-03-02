#include<stdio.h>
main(){

int n,i=1,s=0;
printf("enter the limit of natural no.'s ");
scanf("%d",&n);
while(i<=n)
{s=s+i*i*i;
i++;
 } 
 printf("%d",s);
}
