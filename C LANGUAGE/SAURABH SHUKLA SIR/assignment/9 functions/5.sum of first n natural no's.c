//fuxn to print sum of first n natural no.
#include<stdio.h>
int add(int);
main()
{int n,x,s;
printf("enter the limit of of n ");
scanf("%d",&n);
s= add(n);
printf("%d",s);

}
int add(int y)
{int i,sum=0;
for(i=1;i<=y;i++)
{sum=i+sum;

}return sum;

}
