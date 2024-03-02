//fxn to rotate an array towards right or left  by k no of positions position
void display(int arr[],int n);
void rotate(int arr[],int n);
#include<stdio.h>
main()
{
int arr[50],n,i;
printf("enter the size of array");
scanf("%d",&n);
printf("enter the elements of array");
for(i=0;i<n;i++)
{
	scanf("%d",&arr[i]);
}
display(arr,n);
rotate(arr,n);
display(arr,n);
}
void display(int arr[],int n)
{
	int i;
	printf("the array:");
	for(i=0;i<n;i++)
	printf("%d",arr[i]);
	printf("\n");
}
void rotate(int arr[],int n)
{
	int temp,r,i,nr;
	printf("press 1 for right rotaion & 0 for left rotation\n");
	scanf("%d",&r);
	printf("enter the no. of rotation\n");
	scanf("%d",&nr);
	while(nr!=0)
	{
		if(r==1)
		{
			temp=arr[0]; // 0 position wale element ko store kr liya gya last mein (n-1 pe) pahuchae ke liye
			for(i=0;i<=n-2;i++) //(n-2) tak ke elements ko ek ek position aage(left side mein) kr de aur jo 0 position pe element tha usko last position pe pahucha do
			{
				arr[i]=arr[i+1];
			}
			arr[n-1]=temp;
			
		}
		else
		{
			temp=arr[n-1];  // last element ko store kr liya gya 0 poition pe pahuchane ke liye
			for(i=n-1;i>=1;i--)// 1 Position Tak element ko ek ek position peeche peeche (right side)dhakel dena hain aur jo (n-1) position pe tha usko 0 position pe pahucha dena hain
			{
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		nr--;
	}
	
}

