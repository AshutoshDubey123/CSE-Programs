//fuxn to calculate sum of squares of first n natural no's
#include<stdio.h>
int sum(int);
main()
{int n,s;
printf("enter the limit of n ");
scanf("%d",&n);
s=sum(n);
printf("%d",s);
}
int sum(int n)
{int i,x=0;
for(i=1;i<=n;i++)
{x=x+i*i;
}
return x;
}

