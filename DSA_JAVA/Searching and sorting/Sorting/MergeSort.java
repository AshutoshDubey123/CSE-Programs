import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];  // Array declaration

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.print("The elements in the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Perform merge sort
        mergeSort(a, 0, n - 1);

        // Display the sorted array
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    // Merge sort function
    public static void mergeSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

    // Function to merge the subarrays of a[]
    public static void merge(int[] a, int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;

        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            LeftArray[i] = a[lb + i];
        }
        for (int j = 0; j < n2; j++) {
            RightArray[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = lb;

        // Merge the temp arrays back into a[]
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of LeftArray, if any
        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of RightArray, if any
        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
