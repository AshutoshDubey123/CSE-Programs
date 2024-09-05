//you can see the dry run on the copy

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue (enqueue). Enqueue occurs from rear side
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        if (front == -1) {
            front = rear; // First element added
        }
        size++;
    }

    // Method to remove an element from the queue (dequeue). Deletion occurs from front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            // Queue is now empty after this dequeue
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
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
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();  // Queue elements: 10 20 30 40 50 

        System.out.println("Dequeued: " + queue.dequeue());  // Dequeued: 10
        System.out.println("Front element: " + queue.peek());  // Front element: 20

        queue.enqueue(60);  // Should be added successfully
        queue.display();  // Queue elements: 20 30 40 50 60
    }
}
/*
Queue elements: 10 20 30 40 50 
Dequeued: 10
Front element: 20
Queue elements: 20 30 40 50 60 
 */