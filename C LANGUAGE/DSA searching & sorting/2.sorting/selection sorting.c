#include<stdio.h>
int main()
{
	int n,i,j,t;
	printf("enter the size of array");
	scanf("%d",&n);
	int a[n];           
	printf("enter the elements of arrray");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("the elements in the array are: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	printf("\n");
	
	for(i=0;i<n;i++)
	{
		int min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
		 	}
	    }
	if(min!=i)
	{t=a[i];
	 a[i]=a[min];
	 a[min]=t;
		
	}
		
	}
	printf("the sorted array is: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	
}
