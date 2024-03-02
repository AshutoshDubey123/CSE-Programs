#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// function to swap two numbers
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// function to perform bubble sort
void bubbleSort(int arr[], int n) {
    int i, j;
    for (i = 0; i < n-1; i++) {
        // last i elements are already sorted
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
}

int main() {
    int n, i;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    
    // dynamically allocate memory for the array
    int *arr = (int*) malloc(n * sizeof(int));
    
    // generate random numbers and fill the array
    srand(time(NULL));  // seed the random number generator
    for (i = 0; i < n; i++) {
        arr[i] = rand() % 100;  // generate random number between 0 and 99
    }
    
    // print the unsorted array
    printf("Unsorted Array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    
    // perform bubble sort and measure execution time
    clock_t tStart = clock();
    bubbleSort(arr, n);
    
    // print the sorted array
    printf("Sorted Array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    
    // free the dynamically allocated memory
    free(arr);
    printf("Time taken: %.6fs\n", (double)(clock() - tStart)/CLOCKS_PER_SEC);
    return 0;
}
