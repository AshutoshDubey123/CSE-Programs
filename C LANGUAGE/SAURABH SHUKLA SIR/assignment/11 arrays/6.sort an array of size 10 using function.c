//sort array of size 10
#include<stdio.h>
void input(int [],int);
void sort(int [],int);
void display(int [],int);
main()
{
	int a[10];
	input(a,10);
	sort(a,10);
	display(a,10);
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
	for(i=0;i<=9;i++)
	printf("%d\n",b[i]);
}


