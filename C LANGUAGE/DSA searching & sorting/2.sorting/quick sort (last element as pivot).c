#include<stdio.h>
void quicksort (int a[],int lb,int ub);
int partition (int a[],int lb,int ub);
void swap(int *x,int *y);

int main()
{
	int n,i;
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
{int loc;

if(lb<ub)
{
  loc=partition(a,lb,ub);
  quicksort(a,lb,loc-1);
  quicksort(a,lb+1,ub);
}
}

int partition (int a[],int lb,int ub)
{
int pivot=a[ub],i=lb-1,j;
for(j=lb;j<ub;j++)
{
if(a[j]<=pivot)
  {
i++;
swap(&a[i],&a[j]);
  }
}
swap(&a[i+1],&a[ub]);
return (i+1);
}
void swap(int *x,int *y)
{int temp;
temp=*x;
*x=*y;
*y=temp;
}
