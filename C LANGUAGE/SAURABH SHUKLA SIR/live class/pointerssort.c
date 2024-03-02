#include <stdio.h>
 void input(int *a,int size);
 void sort(int*ptr,int n) ;

int main() {
    int size;
  printf("enter the size of array");
  scanf("%d",&size);
  int a[size];
  printf("the elements in the array are:");
    input(a,size);
     printf("the elements in sorted order is:");
    sort(a,size);

    return 0;
}
 void input(int *a,int size)
{
    int i;
    for(i=0;i<size;i++)
     scanf("%d",a+i);
     
}
void sort(int*ptr,int n) 
{ 
    int i, j, t; 
  
    // Sort the numbers using pointers 
    for (i = 0; i < n; i++) { 
  
        for (j = i + 1; j < n; j++) { 
  
            if (*(ptr + j) < *(ptr + i)) { 
  
                t = *(ptr + i); 
                *(ptr + i) = *(ptr + j); 
                *(ptr + j) = t; 
            } 
        } 
    } 
  
    // print the numbers 
    for (i = 0; i < n; i++) 
        printf("%d ", *(ptr + i)); 
} 