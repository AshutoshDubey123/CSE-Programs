#include<stdio.h>
#include<stdlib.h>
main()
{int choice;
int a,b,sum,sub,mul,div;
printf("\n1 Addition");
printf("\n2 Subtraction");
printf("\n3 Multiplication");
printf("\n4 Division");
printf("\n5 Exit");
printf("\nenter your choice");
scanf("%d",&choice);
switch(choice)
{case 1:printf("enter two numbers");
        scanf("%d%d",&a,&b);
        sum=a+b;
        printf("the sum is ");
        printf("%d",sum);
        break;
case 2:printf("enter two numbers");
        scanf("%d%d",&a,&b);
        sub=a-b;
        printf("the difference is ");
        printf("%d",sub);
        break;
case 3:printf("enter two numbers");
        scanf("%d%d",&a,&b);
        mul=a*b;
        printf("the product is ");
        printf("%d",mul);
        break;
case 4:printf("enter two numbers");
        scanf("%d%d",&a,&b);
        div=a/b;
        printf("the result is ");
        printf("%d",div);
        break;
case 5:exit(0);
       
default: printf("invalid input");       
}
}
