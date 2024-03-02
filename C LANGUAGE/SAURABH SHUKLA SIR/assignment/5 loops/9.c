#include<stdio.h>
main()
{int a=-1,b=1,i=0,n;
printf("enter the no.");
scanf("%d",&n);
while(i<n){
a=a+b;

printf(" %d",a);
i++;if(i>=n)
break;

b=a+b;
 printf(" %d",b);
 i++;
 }
}
