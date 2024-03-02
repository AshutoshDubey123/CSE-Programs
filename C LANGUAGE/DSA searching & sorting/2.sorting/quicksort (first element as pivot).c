#include<stdio.h>
int partition(int a[],int lb,int ub);
void quicksort(int a[],int lb,int ub);
void swap(int *x,int*y);

void main()
{
	int n,i,t;
	printf("enter the size of array");
	scanf("%d",&n);
	int a[n];           //array declaration of size n can only be done once the value of n is scanned 
	printf("enter the elements of arrray");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("the elements in the array are: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	printf("\n");
	
	quicksort(a, 0, n - 1); 
	 
	printf("the sorted array is: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	
} 

void quicksort(int a[],int lb,int ub)
{   int loc;
	if(lb<ub)
	{loc=partition(a,lb,ub);
	quicksort(a,lb,loc-1);
	quicksort(a,loc+1,ub);
	}
}

int partition(int a[],int lb,int ub)
{
int pivot,start,end;
pivot=a[lb]; //set first element as pivot element
start=lb;
end=ub;
while(start<end)
	{
		while(a[start]<=pivot)
		{
		start++;
		}
	    
	    while(a[end]>pivot)
	    {
		end--;
	    }
	    if(start<end)
	    {
		swap(&a[start],&a[end]);
	    }
   }
   
   
swap(&a[lb],&a[end]);         //swap pivot and end element
return end;	
}

void swap(int *x,int *y)
{
	int temp;
	temp=*x;
	*x=*y;
	*y=temp;
	}

