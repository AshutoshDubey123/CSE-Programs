//fxn to find index of smallest element of an array of size n
#include <stdio.h>
int main() {
	int n, i, sval;

	printf("\nInput the length of the array: ");
	scanf("%d", &n);

	int a[n];
    printf("\nInput the array elements:\n ");
	for(i = 0; i < n; i++) {
			scanf("%d", &a[i]);
	}
	sval = a[0];                       //first assuming the element present at 0 position to be minimum
	for(i = 0; i < n; i++)            //to find the smallest element in the array
	{
		if(sval > a[i]) 
		{
			sval = a[i];
        }
	}
	
	printf("Smallest Value: %d\n", sval);
	
	for(i=0;i<n;i++)
	{
	if(a[i]==sval)             //to check whether more than one smallest value is presen
	printf("the smallest element is found at position %d\n",i+1);
    }
	return 0;
}

