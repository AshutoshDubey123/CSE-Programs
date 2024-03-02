//recursive function to calculate sum of digits of a given no.
#include<stdio.h>
int sum(int);
main()
{   int num,y;
	printf("enter the no. ");
	scanf("%d",&num);
	y=sum(num);
	printf("%d",y);
}
int sum(int x)
{
	if(x==0)
	return 0;
	else
	return(x%10+sum(x/10));
	
}
