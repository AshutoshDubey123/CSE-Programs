//print all prime numbers under 100
#include<stdio.h>
main()
{int i,n,count=0;
for(n=2;n<=100;n++){
	count=0;
	for(i=1;i<=n;i++){
		if(n%i==0)
		count++;}
		if(count==2)
		printf("%d ",n);}
		
	
}


