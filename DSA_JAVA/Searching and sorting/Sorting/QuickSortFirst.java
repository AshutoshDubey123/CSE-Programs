////Taking first element as pivot
class QuickSortFirst {
    // Function to display the array
    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function of the program
    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6, 7};

        int size = a.length;
        display(a, size);

        quickSort(a, 0, size - 1);
        display(a, size);
    }

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive function to apply quickSort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index, partition() function will return the index of the partition
            int indexPI = partition(arr, low, high);

            quickSort(arr, low, indexPI - 1);  // Left partition
            quickSort(arr, indexPI + 1, high); // Right partition
        }
    }

    /*
    Partition function to do Partition:
    Elements on the left side of pivot will be smaller,
    and elements on the right side of pivot will be greater.
    */
    static int partition(int[] arr, int low, int high) {
        // Pivot element selected as the first element in the array
        int pivot = arr[low];
        int swapIndex = low;

        for (int j = low + 1; j <= high; j++) {
            // Check if the current element is smaller than the pivot element
            if (arr[j] < pivot) {
                swapIndex++; // Increment swapping index
                swap(arr, swapIndex, j);
            }
        }
        // Swap the pivot element with the element at the swapIndex
        swap(arr, low, swapIndex);

        return swapIndex;
    }
}
