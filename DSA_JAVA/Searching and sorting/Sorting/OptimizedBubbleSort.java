import java.util.Scanner;

public class OptimizedBubbleSort {

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

        // Optimized bubble sort algorithm
        for (int r = 1; r <= n - 1; r++) {
            boolean flag = false;
            for (int i = 0; i <= n - 1 - r; i++) {
                if (a[i] > a[i + 1]) {
                    // Swap elements
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                    flag = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!flag) {
                break;
            }
        }

        // Display the sorted array
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
