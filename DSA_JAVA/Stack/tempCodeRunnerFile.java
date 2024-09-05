import java.util.*;

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
    s.pop();  // Attempt to pop from an empty stack
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
