//print sum of first n natural no.
#include<stdio.h>
int sum(int);
main()
{int x,y;
	printf("enter the limit \n");
	scanf("%d",&x);
	y=sum(x);
	printf("%d",y);
}
int sum(int n)
{
	if(n==1)
	return 1;
	return (n+sum(n-1));
}
