//print first n prime numbers
#include<stdio.h>
main()
{int n,c=2,i=1,count=0,count1=0;
printf("enter the limit ");
scanf("%d",&n);
while(c>=2){
	count=0;
for(i=1;i<=c;i++){
	if(c%i==0)
	count++;
	}
	if(count==2){
	printf("%d ",c);
	count1++;}
	if(count1>n)
	break;
	c++;}
}
