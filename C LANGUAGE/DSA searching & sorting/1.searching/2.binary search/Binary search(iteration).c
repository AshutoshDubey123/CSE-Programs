#include<stdio.h>
int binarysearch(int a[],int n,int ele);
int binarysearch(int a[],int n,int ele)
{   int l,r,mid;
	l=0,r=n-1;
	while(l<=r)
	{
		mid=(l+r)/2;
		if(ele==a[mid])
		return mid;
		if(ele>a[mid])
		l=mid+1;
		else
		r=mid-1;		
	}
	//if(l>r) this has been commented as there is no need of it, when control comes out of loop it means the same
	return -1;
}


 int main()
{
int n,i,ele,retur;

printf("enter the size of array: ");
scanf("%d",&n);
int a[n];

printf("enter the array elements in sorted order");
for(i=0;i<n;i++)
scanf("%d",&a[i]);

printf("the elements in the array are : ");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
printf("\n\n");

printf("enter the element to be searched: "); 
scanf("%d",&ele);

retur=binarysearch(a,n,ele);

if(retur==-1)
printf("\n%d doesn't exist in the array",ele);
else
printf("\n%d is present in the array at position %d",ele,retur+1);
return 0;
	
}
