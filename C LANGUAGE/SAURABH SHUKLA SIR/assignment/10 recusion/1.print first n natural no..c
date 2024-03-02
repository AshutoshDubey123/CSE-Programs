//recursive fxn, to print first n natural no.
#include<stdio.h>
void printN(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	printN(x);
}
void printN(int n)
{if(n>0)
{
printN(n-1);
printf("%d\n",n);
}
}
