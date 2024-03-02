//sum of first n odd natural no's
#include<stdio.h>
int sumodd(int);
main()
{int x,y;
	printf("enter the limit ");
	scanf("%d",&x);
	y=sumodd(x);
	printf("%d",y);
}
int sumodd(int n)
{
	if(n==1)
	return 1;
	else
	return((2*n-1)+sumodd(n-1));
}
