#include<stdio.h>

main()
{int i=2,n;
printf("enter the no. of first n even natural no. in reverse order to be printed");
scanf("%d",&n);
while(i<=2*n)
{printf("%d ",2*n+2-i);
i+=2;
}
}
