//octal equivalent of a given decimal number
#include<stdio.h>
void dtoo(int);
main()
{   int x;
	printf("enter the decimal no.");
	scanf("%d",&x);
	printf("the octal equivalent is ");
	dtoo(x);
}
void dtoo(int n)
{
	if(n==0){
	printf("0");
		 }
		if(n>=1)
	{	dtoo(n/8);
		printf("%d",n%8);
	}
	}
