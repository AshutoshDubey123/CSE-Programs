#include<stdio.h>
int main()
{
	int n,i,j,temp;
	printf("enter the size of array");
	scanf("%d",&n);
	int a[n];                        //array declaration of size n can only be done once the value of n is scanned 
	printf("enter the elements of arrray");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("the elements in the array are: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	printf("\n");
	for(i=1;i<n;i++)
	{
		temp=a[i];
		for(j=i-1;j>=0;j--)
		{
	       if(a[j]>temp)
		    a[j+1]=a[j];
		   else
		    break; 
		}
	a[j+1]=temp;
	}
	
	printf("the sorted array is: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	
}
