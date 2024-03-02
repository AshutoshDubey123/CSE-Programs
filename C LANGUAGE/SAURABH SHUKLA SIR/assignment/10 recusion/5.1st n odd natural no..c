//recursive fxn.to print 1st n odd natural no's
#include<stdio.h>
void oddN(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	oddN(x);
}
void oddN(int n)
{if(n>0)
  {
	oddN(n-1);
	printf("%d\n",(2*n-1));
  }	
}
