class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinearQueueLL {
    Node front;  // Front of the queue
    Node rear;   // Rear of the queue
    int size;    // Size of the queue

    // Constructor to initialize the queue
    public LinearQueueLL() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() //has time complexity of O(1), unlike when implemented using array
    {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) { // If the queue becomes empty
            rear = null;
        }
        size--;
        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return front.data;
    }

    // Method to get the current size of the queue
    public int size() {
        return size;
    }

    // Method to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueueLL queue = new LinearQueueLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();  // Queue elements: 10 20 30 40 50 

        System.out.println("Dequeued: " + queue.dequeue());  // Dequeued: 10
        System.out.println("Front element: " + queue.peek());  // Front element: 20

        queue.display();  // Queue elements: 20 30 40 50 

        queue.enqueue(60);
        queue.display();  // Queue elements: 20 30 40 50 60
    }
}
/*
Queue elements: 10 20 30 40 50 
Dequeued: 10
Front element: 20
Queue elements: 20 30 40 50 
Queue elements: 20 30 40 50 60 
 */
