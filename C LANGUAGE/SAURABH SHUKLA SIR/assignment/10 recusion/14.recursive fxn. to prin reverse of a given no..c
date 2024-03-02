//recursive fxn. to print reverse of a given no.
#include<stdio.h>
void reverse(int);
main()
{   int x;
	printf("enter the no. ");
	scanf("%d",&x);
	printf("the reverse of the no. is ");
	reverse(x);
}
void reverse(int n)
{ if(n>=1){
   printf("%d",n%10);
reverse(n/10);
	}
}
