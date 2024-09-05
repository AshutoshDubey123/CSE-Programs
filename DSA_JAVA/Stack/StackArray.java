class StackArray {
    int[] stack;
    int top;
    int capacity;

    // Constructor to initialize the stack
    StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates an empty stack
    }

    // Push method to add an element to the stack
    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Unable to push " + value);
            return;
        }
        stack[++top] = value;//After incrementing top, this line assigns the value to the new top position in the stack.
        //top++;
        //stack[top] = value;

    }

    // Pop method to remove the top element from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        return stack[top--];
    }

    // Peek method to view the top element without removing it
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return top == -1;//if top is -1 true will be returned
    }

    // Method to get the size of the stack
    int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);//5 is size

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
Stack Underflow! No element to pop.
 */
