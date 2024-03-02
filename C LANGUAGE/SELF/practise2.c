#include<stdio.h>
void main()
{int n,i,x;
	printf("enter the size of array");
	scanf("%d",&n);
	int a[n];
	printf("enter the elements of array");
	for(i=0;i<n;i++){
	
	scanf("%d",&a[i]);
}
	for(i=0;i<n;i++)
	{
		printf("%d\n",a[i]);
	}
	printf("enter the position at which to be deleted");
	scanf("%d",&x);
	for(i=x-1;i<n-1;i++)
	{
		a[i]=a[i+1];
	}
	n--;
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}
