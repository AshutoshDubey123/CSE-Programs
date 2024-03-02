//fxn to reverse an array
#include<stdio.h>
void reverse(int arr[],int n);
main()
{
int arr[50],n,i;
printf("enter the size of array");
scanf("%d",&n);
printf("enter the elements of array");
for(i=0;i<n;i++)
{
	scanf("%d",&arr[i]);
}

reverse(arr,n);

}


void reverse(int arr[],int n)
{   int i;
	for(i=n-1;i>=0;i--)
	{
		printf("%d",arr[i]);
	}
}
