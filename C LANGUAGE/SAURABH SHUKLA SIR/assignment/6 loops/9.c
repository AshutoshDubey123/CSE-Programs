//program to print all factors of a given no.
#include<stdio.h>
main()
{int a,i=1;
printf("enter the no.");
scanf("%d",&a);
for(i=1;a>=1;i++)
{while(a%i==0){
printf("%d ",i);
break;
}
}
  }
