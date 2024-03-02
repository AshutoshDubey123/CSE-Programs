#include<stdio.h>
int main()
{
	int n,i,k,found=0;
	printf("enter the size of array: ");
	scanf("%d",&n);
	int a[n];
	printf("enter the array elements: \n");
	for(i=0;i<n;i++)
     {
	   scanf("%d",&a[i]);
	 }
	 printf("enter the element to be searched");
	 scanf("%d",&k);
	 for(i=0;i<n;i++)
	 {
	 	if(a[i]==k){
	 	found=1;
		printf("%d is present at %dth position of array\n",k,i+1);
	               }
	 }
	 if(found==0)
	 printf("%d does not exist in the array",k);
	 return 0;
}
