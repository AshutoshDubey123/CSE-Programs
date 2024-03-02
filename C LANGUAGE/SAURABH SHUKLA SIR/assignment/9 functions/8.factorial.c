//fuxn to calculate factorial of a no.
#include<stdio.h>
int fact(int);
main()
{int n,f;
printf("enter the no. ");
scanf("%d",&n);
f=fact(n);
printf("%d",f);
}
int fact(int a)
{int i,c=1;
if(a>0)
{for(i=1;i<=a;i++)
c=c*i;
return c;
}
if(a==0)
return 1;
}
