public class LinearQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public LinearQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear++;
        queue[rear] = data;
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty. Cannot dequeue.");
        return -1;
    }
    int data = queue[front];
    
    // Shift all elements to the left by one position
    for (int i = front; i < rear; i++) //front is zeroth index
    {
        queue[i] = queue[i + 1];
    }
    
    rear--; // Decrement rear as one element is removed
    return data;
}


    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
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
        return rear - front + 1;
    }

    // Method to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();  // Queue elements: 10 20 30 40 50 

        System.out.println("Dequeued: " + queue.dequeue());  // Dequeued: 10
        System.out.println("Front element: " + queue.peek());  // Front element: 20

        queue.display();  // Queue elements: 20 30 40 50 

        queue.enqueue(60);  // Queue elements: 20 30 40 50 60
        queue.display(); 

        queue.enqueue(70); //Queue is full. Cannot enqueue 70


    }
}
/*
Queue elements: 10 20 30 40 50 
Dequeued: 10
Front element: 20
Queue elements: 20 30 40 50
Queue elements: 20 30 40 50 60
Queue is full. Cannot enqueue 70
 */
