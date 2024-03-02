//recursive fxn. to print nth term of fibbonacci series
#include<stdio.h>
int fibo(int);
main()
{	int n,y;
	printf("enter the value of n ");
	scanf("%d",&n);
	printf("the %dth term is: ",n);
	y=fibo(n);
	printf("%d",y);
}
int fibo(int n)
{	
	if(n==1)
	return 0;
	if(n==2)
	return 1;
	return(fibo(n-1)+fibo(n-2));
}
