//recursive fxn to print 1st n natural no. in reverse order
#include<stdio.h>
void printNreverse(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	printNreverse(x);
}
void printNreverse(int n)
{
	if(n>0)
	{
	printf("%d\n",n);
	printNreverse(n-1);
	}
	
}
