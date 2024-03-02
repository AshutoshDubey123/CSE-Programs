//fxn to sort an array of size n
#include<stdio.h>
void input(int [],int);
void sort(int [],int);
void display(int [],int);

main()
{   int n;
	int a[n];
	printf("enter the size of array");
	scanf("%d",&n);
	input(a,n);
	sort(a,n);
	display(a,n);
	}
void input(int A[],int size)
{   int i;
	printf("enter %d numbers",size);
	for(i=0;i<=size-1;i++)
	    scanf("%d",&A[i]);
}
void sort(int A[],int size)
{
	int i,r,t;
	for(r=1;r<=size-1;r++)
	{
		for(i=0;i<=size-1-r;i++)
		if(A[i]>A[i+1])
		{
			t=A[i];
			A[i]=A[i+1];
			A[i+1]=t;
        }
	}
}
void display(int b[],int size)
{
	
	int i;
	printf("the sorted array is:");
	for(i=0;i<=size-1;i++)
	printf("%d\n",b[i]);
}


