#include<stdio.h>
int partition(int a[],int lb,int ub);
void quicksort(int a[],int lb,int ub);
void swap(int *x,int*y);

int main()
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
void swap(int *x,int*y)
{
	int temp;
	temp=*x;
	*x=*y;
	*y=temp;
	}


//partition function definition
int partition(int a[],int l,int r)
{
    int j,temp,i=l;

    for(j=l;j<r-1;j++)
    {
        //swap values if a[j]<=a[r-1](i.e. pivot)
        if(a[j]<=a[r-1])
        {
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
        }
    }
    //place pivot at its position by swapping
    temp=a[i];
    a[i]=a[r-1];
    a[r-1]=temp;
    return i;
}
