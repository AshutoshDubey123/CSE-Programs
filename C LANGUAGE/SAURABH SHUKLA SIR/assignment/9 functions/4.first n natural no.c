//fxn to print 1st n natual no's
#include<stdio.h>
void nat(int);
main()
{int n;
printf("enter the limit ");
scanf("%d",&n);
nat(n);
}
void nat(int n)
{int i=1;
while(i<=n)
{printf("%d\n",i);
i++;
}
}
