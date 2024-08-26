class LinearSearch {

    private static void LinearSearch(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == item) {
                System.out.println(item + " Found at index : " + i);
                System.out.println(item + " Found at position : " + (i+1));
                return;//don't use return if you want to search for whole array if the item is present at more than one index
            }
        }
        System.out.println("Not found");
    }

    public static void main(String args[]) {
        int[] arr = {10, 5, 15, 21, -3, 7};
        int item = 21;
        LinearSearch(arr, item);
    }
}
/*
21 Found at index : 3
21 Found at position : 4
 */
