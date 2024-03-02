//recursive fxn.to print 1st n odd natural no's
#include<stdio.h>
void oddNrev(int);
main()
{int x;
	printf("enter the limit");
	scanf("%d",&x);
	oddNrev(x);
}
void oddNrev(int n)
{if(n>0)
  {
	printf("%d\n",(2*n-1));
	oddNrev(n-1);
  }	
}
