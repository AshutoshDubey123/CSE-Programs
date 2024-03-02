//fxn to calculate mean deviation of given elements
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
