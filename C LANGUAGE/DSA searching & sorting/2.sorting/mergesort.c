#include<stdio.h>
void mergeSort(int a[], int lb, int ub);
void merge(int a[], int lb, int mid, int ub);
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
	
	mergeSort(a, 0, n - 1); 
	 
	printf("the sorted array is: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	
}
void mergeSort(int a[], int lb, int ub)  
{  
    if (lb < ub)   
    {  
        int mid = (lb + ub) / 2;  
        mergeSort(a, lb, mid);  
        mergeSort(a, mid + 1, ub);  
        merge(a, lb, mid, ub);  
    }  
}  

/* Function to merge the subarrays of a[] */  
void merge(int a[], int lb, int mid, int ub)    
{    
    int i, j, k;  
    int n1 = mid - lb + 1;    
    int n2 = ub - mid;    
      
    int LeftArray[n1], RightArray[n2]; //temporary arrays  
      
    /* copy data to temp arrays */  
    for (i = 0; i < n1; i++)    
    LeftArray[i] = a[lb + i];    
    for ( j = 0; j < n2; j++)    
    RightArray[j] = a[mid + 1 + j];    
      
    i = 0; /* initial index of first sub-array */  
    j = 0; /* initial index of second sub-array */   
    k = lb;  /* initial index of merged sub-array */  
      
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }    
}    
