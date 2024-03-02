//next prime no. of a given no.
#include<stdio.h>
main()
{int a,n,i=1,count=0;
printf("enter the no.");
scanf("%d",&a);
n=a+1;
while(n>a){
count=0;
for(i=1;i<=n;i++){
if(n%i==0)
		count++;}
		if(count==2){
		printf("%d",n);
break;	}
		n++;
            }
		}
