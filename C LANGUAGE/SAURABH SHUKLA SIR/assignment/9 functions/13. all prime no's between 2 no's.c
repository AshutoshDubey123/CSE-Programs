//print all prime no b/w two numbers
#include<stdio.h>
void prime(int,int);
main()
{int num1,num2;
	printf("enter two numbers");
scanf("%d\n%d",&num1,&num2);
	prime(num1,num2);
}
void prime(int n1,int n2)
{int n,i,count=0;
	for(n=n1+1;n<n2;n++)
	{count=0;
	for(i=2;i<n;i++)
	{
	if(n%i==0)
	count++;}
	
	if(count==0)
	printf("%d\n",n);
}
}
