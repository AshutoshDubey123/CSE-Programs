#include<stdio.h>
int main()
{
	int n,i,r,t;
	printf("enter the size of array");
	scanf("%d",&n);
	int a[n];           //array declaration of size n can only be done once the value of n is scanned 
	printf("enter the elements of arrray");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("the elements in the array are: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);

	for(r=1;r<=n-1;r++){
    for(i=0;i<=n-1-r;i++) {
	
	
    if(a[i]>a[i+1])
    {
    	t=a[i];
    	a[i]=a[i+1];
    	a[i+1]=t;
	}                     
	                   }
    }
	printf("the sorted array is: ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	
}
