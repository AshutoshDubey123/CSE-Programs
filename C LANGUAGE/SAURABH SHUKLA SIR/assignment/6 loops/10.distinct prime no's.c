//program to print all distinct prime factors of a given no.
#include<stdio.h>
main()
{int i,n,count;
printf("enter the no.");
scanf("%d",&n);
for(i=2;i<=n;i++){
	count=0;
while(n%i==0){n=n/i;
	count++;
	         }
	while(count>=1){
	printf("%d ",i);
	break;
                   }
				 }
}
