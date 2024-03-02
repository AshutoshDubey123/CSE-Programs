#include<stdio.h>
int bsrec(int a[],int l,int r,int ele);
int bsrec(int a[],int l,int r,int ele)
{   int mid=(l+r)/2;
	
	if(ele>a[mid])
	bsrec(a,mid+1,r,ele);
	else if(ele<a[mid])
	bsrec(a,l,mid-1,ele);
	else  if(a[mid]==ele)
    return mid;
    else
    return -1;
}
 int main()
{
int n,i,ele ,l,r,retur;


printf("enter the size of array: ");
scanf("%d",&n);
l=0,r=n-1;                               //since, initialization of r involves n ,so initialize r only after the value of n is scanned
int a[n]; //you could have initialized the array at the first line of main function but since it is involving n ,so initialize continued...
//only after the value of n is scanned,if instead of n it was a no.you could have initialized the array at the first line of main function 
printf("enter the array elements in sorted order");
for(i=0;i<n;i++)
scanf("%d",&a[i]);

printf("the elements in the array are : ");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
printf("\n\n");

printf("enter the element to be searched: "); 
scanf("%d",&ele);

retur=bsrec(a,l,r,ele);
if(retur==-1)
printf("\n%d doesn't exist in the array",ele);
else
printf("\n%d is present in the array at position %d",ele,retur+1);
return 0;

}
