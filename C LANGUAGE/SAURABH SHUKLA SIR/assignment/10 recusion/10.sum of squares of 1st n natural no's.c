//recursive fxn. to calculate sum of squares of 1st n natural no's
#include<stdio.h>
int sumsq(int);
main()
{int x,y;
printf("enter the limit");
scanf("%d",&x);
y=sumsq(x);
printf("%d",y);
}
int sumsq(int n)
{if(n==1)
	return 1;
	else
	return(n*n+sumsq(n-1));
}
