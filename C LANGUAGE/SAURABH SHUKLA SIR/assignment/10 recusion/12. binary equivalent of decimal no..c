//recursive fxn. to print binary equivalent of a given decimal no.
#include<stdio.h>
void dtob(int);
main()
{int x;
	printf("enter the decimal no.");
	scanf("%d",&x);
	printf("the binary equivqlent is ");
	dtob(x);
}
 void dtob(int n)
{if(n==0){
	printf("0");
		 }
	if(n>=1){
	dtob(n/2);
	printf("%d",n%2);
			}
}
