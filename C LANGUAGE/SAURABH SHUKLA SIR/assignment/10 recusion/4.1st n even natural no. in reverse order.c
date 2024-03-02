//recursive fxn to print 1st n even natural no. in reverse order
#include<stdio.h>
void revevenN(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	revevenN(x);
}
void revevenN(int n)
{
	if(n>0)
	{
	printf("%d\n",2*n);
	revevenN(n-1 );
	}
}

