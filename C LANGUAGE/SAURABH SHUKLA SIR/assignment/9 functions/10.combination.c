//combination
#include<stdio.h>
int combi(int,int);
int fact(int);
main()
{int n,r;
int c;
printf("enter the no. of items \n & no. of times selected at a time ");
scanf("%d%d",&n ,&r);
c=combi(n,r);
printf("%d",c);
}
int fact(int n)
{
	int i=1;
	while(n>0)
	{
		i=i*n;
		n--;
	}
	return i;
}
int combi(int n,int r)
{ int a;
  a=fact(n)/(fact(r)*fact(n-r));
  return a;
}
