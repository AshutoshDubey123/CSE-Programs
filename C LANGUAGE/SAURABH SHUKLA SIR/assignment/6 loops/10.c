//program to print all prime factors of a given no.
#include<stdio.h>
main()
{int x,i;
printf("enter the no.");
scanf("%d",&x);
for(i=2;x>1;i++)
{while(x%i==0){
	printf("%d ",i);
	x=x/i;
}
}
}
