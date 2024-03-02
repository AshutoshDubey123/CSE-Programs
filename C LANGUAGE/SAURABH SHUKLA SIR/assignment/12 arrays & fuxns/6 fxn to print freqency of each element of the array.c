//fxn to print freqency of each element of the array
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
	frequency(a,n);
	return 0;
	
}
int frequency(int a[],int n)
{
	int i,j,count;
	for(i=0;i<n;i++)
	{   
	    count=0;
		for(j=0;j<n;j++)
		{
			if(a[i]==a[j])
			count++;
		}
		printf("%d has frequecy %d\n",a[i],count);
	}
}
