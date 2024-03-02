#include <stdio.h>
#include <stdlib.h>

int main() {
	int i;
	int *ptr=(int*)malloc(2*sizeof(int));
	if (ptr ==NULL){
	    
	    printf ("memory not available");
	    exit(1);
	}
	printf("enter the two numbers:\n");
	for(i=0;i<2;i++)
	scanf("%d",ptr+i);
	int *new_ptr=(int*)realloc(ptr,4*sizeof(int));
	if (new_ptr ==NULL){
	    
	    printf ("memory not available");
	    exit(1);
	}
	printf("enter more two numbers:\n");
	for(i=2;i<4;i++)
	scanf("%d",new_ptr+i);
	for(i=0;i<4;i++)
	printf("%d ",*(new_ptr+i));
	
	return 0;
}
