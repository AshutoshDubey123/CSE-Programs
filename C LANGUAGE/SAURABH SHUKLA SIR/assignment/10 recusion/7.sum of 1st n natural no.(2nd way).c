//print sum of first n natural no's
#include<stdio.h>
int sum(int);
main()
{int n;
printf("enter a positive no.: ");
scanf("%d",&n);
printf("sum = %d",sum(n));	
}
int sum(int n)
{
	if(n!=0)
	return(n+sum(n-1));
	else
	return n;
}
