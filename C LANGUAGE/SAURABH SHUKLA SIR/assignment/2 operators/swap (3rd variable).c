#include<stdio.h>
main()
{int num1,num2,num3;
printf("enter two integers");
scanf("%d%d",&num1,&num2);

num3=num1;num1=num2;num2=num3 ;
printf("%d,%d",num1,num2);

}
