//sum of 10 numbers
#include<stdio.h>
main()
{
	int i,a[10],sum=0;
	printf("enter the 10 no's\n");
	for(i=0;i<=9;i++)
		scanf("%d",&a[i]);
		
	for(i=0;i<=9;i++)
		sum=sum+a[i];
	printf("the sum is %d",sum);
}
