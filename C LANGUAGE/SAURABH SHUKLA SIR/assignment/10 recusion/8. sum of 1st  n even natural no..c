//sum of first n even natural no's
#include<stdio.h>
int sumeven(int);
main()
{int x,y;
	printf("enter the limit ");
	scanf("%d",&x);
	y=sumeven(x);
	printf("%d",y);
}
int sumeven(int n)
{
	if(n==1)
	return 2;
	else
	return(2*n+sumeven(n-1));
}
