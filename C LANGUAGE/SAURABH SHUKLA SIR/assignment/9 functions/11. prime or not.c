//prime or not
#include<stdio.h>
int prime(int);
main()
{int n,p;
printf("enter the no.");
scanf("%d",&n);
p=prime(n);
}
int prime(int n)
{int i=2;
while(i<n)
{
if(n%i==0){
	printf("no. is not prime");
return 1;}
else 
i++;
}
printf("no. is prime");
return 0;
}
