#include<stdio.h>
main()
{int x,i;
printf("enter a no.");
scanf("%d",&x);
for(i=2;i<=x-1;i++){
 
if(x%10==0)
break;}
if(i==x)
printf("prime");
else
printf("not prime");

}
