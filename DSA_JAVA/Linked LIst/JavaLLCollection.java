import java.util.LinkedList;
public class JavaLLCollection {
    public static void main(String[] args) {
        /*Creating a LinkedList, we can only store objects.Therefore, we 
        can't use int, float, boolean...; instead we've to use Integer class, Float class...*/
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + fruits);

        // Adding an element at the first position
        fruits.addFirst("Apricot");
        System.out.println("After addFirst: " + fruits);

        // Adding an element at the last position
        fruits.addLast("Elderberry");
        System.out.println("After addLast: " + fruits);

        // Accessing elements from the LinkedList
        System.out.println("First Element: " + fruits.getFirst());
        System.out.println("Last Element: " + fruits.getLast());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Removing elements from the LinkedList
        fruits.removeFirst();
        System.out.println("After removeFirst: " + fruits);

        fruits.removeLast();
        System.out.println("After removeLast: " + fruits);

        fruits.remove(2); // Removes the element at index 2
        System.out.println("After removing element at index 2: " + fruits);

        // Iterating over the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the LinkedList
        fruits.clear();
        System.out.println("After clearing LinkedList: " + fruits);
    }
}
 
/*
LinkedList: [Apple, Banana, Cherry, Date]
After addFirst: [Apricot, Apple, Banana, Cherry, Date]
After addLast: [Apricot, Apple, Banana, Cherry, Date, Elderberry]
First Element: Apricot
Last Element: Elderberry
Element at index 2: Banana
After removeFirst: [Apple, Banana, Cherry, Date, Elderberry]
After removeLast: [Apple, Banana, Cherry, Date]
After removing element at index 2: [Apple, Banana, Date]
Iterating over LinkedList:
Apple
Banana
Date
After clearing LinkedList: []
 */