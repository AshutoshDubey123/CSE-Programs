//recursive fxn to print 1st n even natural no.
#include<stdio.h>
void printevenN(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	printevenN(x);
}
void printevenN(int n)
{
	if(n>0)
	{printevenN(n-1);
	printf("%d\n",2*n);
	}
	
}

