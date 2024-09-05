import java.util.*;//or import java.util.Stack;

public class JavaCollectionFramework{
public static void main(String[] args) {
    
Stack <Integer> s= new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);

    System.out.println("Top element is: " + s.peek());
    System.out.println("Stack size is: " + s.size());

    System.out.println("Popped element: " + s.pop());
    System.out.println("Top element is: " + s.peek());
    System.out.println("Stack size is: " + s.size());

    s.pop();
    s.pop();
    try {
        // Attempting to pop from an empty stack
        s.pop();  
    } catch (EmptyStackException e) {
        System.out.println("Stack is empty! Cannot pop.");
    }

    /* you could also have used this: Checking if the stack is empty before popping
        if (!s.isEmpty()) {
            s.pop();
        } else {
            System.out.println("Stack is empty! Cannot pop.");
        }

        if (!s.isEmpty()) {
            s.pop();
        } else {
            System.out.println("Stack is empty! Cannot pop.");
        }

        // Attempting to pop from an empty stack
        if (!s.isEmpty()) {
            s.pop();
        } else {
            System.out.println("Stack is empty! Cannot pop.");
        }
     */
}
}

/*
Top element is: 30
Stack size is: 3
Popped element: 30
Top element is: 20
Stack size is: 2
Stack is empty! Cannot pop.
*/
