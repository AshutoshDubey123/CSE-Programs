import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] a, int l, int r, int ele) {
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (ele == a[mid])
                return mid;
            if (ele > a[mid])
                l = mid + 1;
            else
                r = mid - 1;
        }
        // No need for a separate condition for l > r, loop exit means not found
        return -1;
    }

    public static int bsrec(int[] a, int l, int r, int ele) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (ele == a[mid])
                return mid;
            if (ele > a[mid])
                return bsrec(a, mid + 1, r, ele);
            else
                return bsrec(a, l, mid - 1, ele);
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int l = 0, r = n - 1;
        int[] a = new int[n]; // array declaration

        System.out.println("Enter the array elements in sorted order(ascending):");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("The elements in the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");

        System.out.print("Enter the element to be searched: ");
        int ele = scanner.nextInt();

        while (true) {
            System.out.println("\t**MAIN MENU**");
            System.out.println("1. Binary search without recursion (using iteration)");
            System.out.println("2. Binary search using recursion");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();

            int retur;
            switch (choice) {
                case 1:
                    retur = binarySearch(a, l, r, ele);//iterative approach
                    if (retur == -1)
                        System.out.println("\n" + ele + " doesn't exist in the array\n");
                    else
                        System.out.println("\n" + ele + " is present in the array at position " + (retur + 1) + "\n");
                    break;
                case 2:
                    retur = bsrec(a, l, r, ele);//recursive approach
                    if (retur == -1)
                        System.out.println("\n" + ele + " doesn't exist in the array\n");
                    else
                        System.out.println("\n" + ele + " is present in the array at position " + (retur + 1) + "\n");
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input\n");
                    break;
            }
        }
    }
}
