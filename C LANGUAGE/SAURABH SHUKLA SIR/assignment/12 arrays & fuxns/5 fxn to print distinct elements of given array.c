//fxn to print distinct elements of given array
#include <stdio.h>
int main() 
{
	int n, i;

	printf("\nInput the length of the array: ");
	scanf("%d", &n);

	int a[n];
    printf("\nInput the array elements:\n ");
	for(i = 0; i < n; i++) 
			scanf("%d", &a[i]);
	distinct(a,n);      //you should only write a while passing the array not a[] or a[n]
	return 0;
	
}
int distinct(int a[],int n)

{   int i,j;
	for(i=0;i<n;i++)// Pick all elements one by one
	{
	for(j=0;j<i;j++)// Check if the picked element is already printed
	{
	if(a[i]==a[j])
	break;
	} 
if (i==j)// If not printed earlier, then print it
printf("%d ", a[i]);
}
return 0;
}
