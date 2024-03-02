#include<stdio.h>
int quicksort(int a[],int lb,int ub);
int partition(int a[],int lb,int ub);
void swap(int*x,int*y);

int main(){
    int n,i;
    printf("enter no. of elements: ");
    scanf("%d",&n);
    int a[n];
    printf("enter array elements: ");
    for (i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("the elements in the array are: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	printf("\n");
	
    quicksort(a,0,n-1);
    printf("the sorted aray is:");
    for (i=0;i<n;i++)
        printf("%d ",a[i]);
}

int quicksort(int a[],int lb,int ub){
	int loc;
    if (lb<ub){
        loc=partition(a,lb,ub);
        quicksort(a,lb,loc-1);
        quicksort(a,loc+1,ub);
    }
}

int partition(int a[],int lb,int ub){
    int pivot=a[lb],i=ub+1,j;
    for (j=ub;j>=lb+1;j--){
        if(a[j]>pivot){
            i--;
            swap(&a[i],&a[j]);
        }
    }
    swap(&a[i-1],&a[lb]);
    return i-1;
}

void swap(int*x,int*y)
{
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
}

