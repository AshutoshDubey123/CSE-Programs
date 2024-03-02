#include <stdio.h>
#include <stdlib.h>

// Function to perform the partition step of QuickSort
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    
    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    
    return (i + 1);
}

// Function to perform QuickSort
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pivot = partition(arr, low, high);
        
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
}

// Function to perform binary search
void binarySearch(int arr[], int low, int high, int target) {
    if (high >= low) {
        int mid = low + (high - low) / 2;
        
        if (arr[mid] == target) {
            printf("Element found at index %d.\n", mid);
            binarySearch(arr, low, mid - 1, target);
            binarySearch(arr, mid + 1, high, target);
        }
        else if (arr[mid] > target)
            binarySearch(arr, low, mid - 1, target);
        else
            binarySearch(arr, mid + 1, high, target);
    }
}

int main() {
    int size, target;
    
    printf("Enter the number of elements: ");
    scanf("%d", &size);
    
    int arr[size];
    
    printf("Enter the elements: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }
    
    printf("Enter the target element to search: ");
    scanf("%d", &target);
    
    // Sort the array
    quickSort(arr, 0, size - 1);
    
    // Perform binary search and report all positions
    printf("Positions of the target element:\n");
    binarySearch(arr, 0, size - 1, target);
    
    if (arr[0] != target && arr[size - 1] != target) {
        printf("Element not found.\n");
    }
    
    return 0;
}
