//whether a no. is armstrong no. or not
#include<stdio.h>
#include<math.h>
void armstrong(int);
main()
{int n;
	printf("enter the no.");
	scanf("%d",&n);
	armstrong(n);
}
void armstrong(int n)
{int count=0,x=n,y=n,remain,result=0;
	while(x!=0)
	{x=x/10;
	count++;
	}
	while(y!=0)
	{remain=y%10;
		result=result+pow(remain,count);
			y=y/10;}
	if (result==n)
	printf("no. is armstrong ");
	else
	printf("no. is not armstrong");
}
