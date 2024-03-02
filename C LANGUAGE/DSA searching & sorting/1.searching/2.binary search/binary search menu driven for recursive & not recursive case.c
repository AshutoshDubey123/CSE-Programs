#include<stdio.h>
#include<stdlib.h>
int binarysearch(int a[],int l,int r,int ele);
int bsrec(int a[],int l,int r,int ele);
int binarysearch(int a[],int l,int r,int ele)
{   int mid;
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
int n,i,ele,l,r,retur,choice;

printf("enter the size of array: ");
scanf("%d",&n);
l=0,r=n-1;
int a[n];         //array declaration

printf("enter the array elements in sorted order");
for(i=0;i<n;i++)
scanf("%d",&a[i]);

printf("the elements in the array are : ");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
printf("\n\n");

printf("enter the element to be searched: "); 
scanf("%d",&ele);

while(1){ 
printf("\t**MAIN MENU**\n");
printf("1.Binary search without recursion(using iteration)\n2.Binary search using recursion\n3.Exit\nEnter Your Choice");
scanf("%d",&choice);
switch(choice)
{case 1:retur=binarysearch(a,l,r,ele);
        if(retur==-1)
        printf("\n%d doesn't exist in the array\n",ele);
        else
        printf("\n%d is present in the array at position %d\n",ele,retur+1);
        break;
case 2:retur=bsrec(a,l,r,ele);
       if(retur==-1)
       printf("\n%d doesn't exist in the array\n",ele);
       else
       printf("\n%d is present in the array at position %d\n",ele,retur+1);
       break;
case 3:exit(0);
default:printf("invalid input\n");
break;
}

}

return 0;
	
}
