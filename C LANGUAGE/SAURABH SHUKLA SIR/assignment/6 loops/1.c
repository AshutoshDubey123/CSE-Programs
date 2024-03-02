//check whether a given no. is prime or not
#include<stdio.h>
main()
{int n,i,count=0;
printf("enter the no.");
scanf("%d",&n);
for(i=1;i<=n;i++){
	if(n%i==0)
	count++;
}if(count==2)
printf("%d is a prime no.",n);
else
printf("%d is not a prime no.",n);
}
