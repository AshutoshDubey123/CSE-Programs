//average of 10 numbers
#include<stdio.h>
main()
{
	int i,a[10],sum=0;
	float avg;
	printf("enter the 10 no's\n");
	for(i=0;i<=9;i++)
		scanf("%d",&a[i]);
		
	for(i=0;i<=9;i++)
		sum=sum+a[i];
	avg=sum/10.0;
	printf("the average is %f",avg);
}
