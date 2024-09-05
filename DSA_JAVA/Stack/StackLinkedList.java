class StackLinkedList {

    // Node class to represent each element in the stack
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Top of the stack; head acts as top
    private int size; // Size of the stack

    
    

    // Push method to add an element to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! The stack is empty.");
            return -1; // Returning -1 to indicate an empty stack
        }
        int poppedValue = top.data;
        top = top.next;
        size--;
        return poppedValue;
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to get the size of the stack
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

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
Stack Underflow! The stack is empty.
 */
