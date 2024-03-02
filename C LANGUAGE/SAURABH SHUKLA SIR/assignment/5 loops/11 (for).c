
//check whether a given no. is a term in fibo series
#include<stdio.h>
main(){
int i, n,a=-1,b=1,c=0;
printf("enter the no. to be checked ");
scanf("%d",&n);
for(i=n;i>c; ){
	c=a+b;
	a=b;
	b=c;
	}
	if(c==n)
		printf("%d is a term in fibonacci series",n);
    else  printf("%d is not a term in fibonacci series",n);   
   }
