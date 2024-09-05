/*
stack of books
stack of carrom/coins
stack of stones

Stack in recursion is memory implicit stack; computer or program themselves created it
Explicit stack is built by programmer himself, which we study

operations: 
push O(1)
pop O(1)
peek O(1) //gives top element of stack

In stack we work with top element of stack

LIFO data structure

stack can be implemented using
Arrays, gives fixed size stack, stack becomes full
ArrayList, gives variable size stack
LinkedList, gives variable size stack, we use head as top here as head is only element in stack where inserting, deleting, seeing takes O(1) time complexity
 */
import java.util.ArrayList;

public class StackArrayList {
    
    ArrayList<Integer> stack;//delclaration

    // Constructor to initialize the stack
    StackArrayList() {
        stack = new ArrayList<>();
    }

    /*
    we could've also directly written
    ArrayList<Integer> stack= new ArrayList<>();
    instead of writing
    ArrayList<Integer> stack;
    StackArrayList() {
        stack = new ArrayList<>();
    }
     */

    // Push method to add an element to the stack
    public void push(int value) {
        stack.add(value);
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // Returning -1 to indicate an empty stack
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack.get(stack.size() - 1);//the last element is at index size - 1
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to get the size of the stack
    public int size() {
        return stack.size();
    }





    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();  // Attempt to pop from an empty stack
    }
}
/*
Top element is: 30
Stack size is: 3
Popped element: 30
Top element is: 20
Stack size is: 2
Stack is empty!
 */

