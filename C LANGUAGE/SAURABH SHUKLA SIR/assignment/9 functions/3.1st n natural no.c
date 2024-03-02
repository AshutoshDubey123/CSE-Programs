//print first n natural no's
#include<stdio.h>
void sum(int);
main()
{int n;
printf("enter the limit of n ");
scanf("%d",&n);
sum(n);
}
void sum (int y)
{int i,x;
for(i=1;i<=y;i++)
{
x=i;
printf("%d\n",x);
}
}

