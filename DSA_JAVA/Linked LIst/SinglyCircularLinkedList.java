class SinglyCircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node last=null;
   
    

    // Insert at the front
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (last == null) //list is empty
        {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;//at this moment last's next contains pointer pointing to 1st node(which is going to 2nd now) 
            last.next = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) //list is empty
        {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Insert at a position
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (last == null) {
            // If the list is empty
            if (position != 1) {
                System.out.println("Invalid position!");
                return;
            }
            // Create a new node and make it point to itself
            Node newNode = new Node(data);
            last = newNode;
            last.next = last;
            return;
        }
         // Create a new node with the given data
         Node newNode = new Node(data);

         // curr will point to head initially
         Node curr = last.next;
 
         if (position == 1) {
             // Insert at the beginning
             newNode.next = curr;
             last.next = newNode;
             return ;
         }
 
         // Traverse the list to find the insertion point
         for (int i = 1; i < position - 1; ++i) {
             curr = curr.next;
 
             // If position is out of bounds
             if (curr == last.next) 
            /*This condition ensures that the function does not attempt to delete a node at an invalid position, 
        preventing potential errors or undefined behavior.
        It is circular linked list if it has come back where it started means it is trying to loop
        example: [10] -> [20] -> [30] 
        If you call deleteAtPosition(4), after reaching the last node (30), temp.next will point back to the head (10), 
        indicating that the list does not have a 4th position.
        The condition if (temp.next == last.next) will be true, triggering the error message.*/
             {
                 System.out.println("Invalid position!");
                 return ;
             }
         }
 
         // Insert the new node at the desired position
         newNode.next = curr.next;
         curr.next = newNode;
 
         // Update last if the new node is inserted at the
         // end
         if (curr == last)
             last = newNode;
 
         return ;
        
    }
    




    // Delete at the beginning
    public void deleteAtBeginning() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    // Delete at a position
    public void deleteAtPosition(int position) {
        if (position < 1 || last == null) {
            System.out.println("Invalid position or list is empty!");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = last.next;
        for (int i = 1; i < position - 1 && temp.next != last.next; i++) {
            temp = temp.next;
        }
        if (temp.next == last.next) 
        /*This condition ensures that the function does not attempt to delete a node at an invalid position, 
        preventing potential errors or undefined behavior.
        It is circular linked list if it has come back where it started means it is trying to loop
        example: [10] -> [20] -> [30] 
        If you call deleteAtPosition(4), after reaching the last node (30), temp.next will point back to the head (10), 
        indicating that the list does not have a 4th position.
        The condition if (temp.next == last.next) will be true, triggering the error message.*/
        {
            System.out.println("Invalid position!");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == last.next) {
            last = temp;
        }
    }

    




// Search for a key in the list and return its position
public int searchKey(int key) {
    if (last == null) {
        System.out.println("List is empty!");
        return -1;  // Return -1 to indicate that the list is empty
    }

    Node temp = last.next;
    int position = 1;  // Start with the first position

    do {
        if (temp.data == key) {
            System.out.println("Key " + key + " found at position " + position + ".");
            return position;  // Return the position where the key is found
        }
        temp = temp.next;
        position++;
    } while (temp != last.next);

    System.out.println("Key " + key + " not found in the list.");
    return -1;  // Return -1 to indicate that the key was not found
}






    // Print the list
    public void printList() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }





    public static void main(String[] args) {
        SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
        scll.insertAtFront(10);
        scll.insertAtEnd(20);
        scll.insertAtPosition(15, 2);
        scll.printList(); // Output: 10 15 20
        scll.deleteAtBeginning();
        scll.printList(); // Output: 15 20
        scll.deleteAtEnd();
        scll.printList(); // Output: 15
        scll.deleteAtPosition(2);//Output: Invalid position!
        scll.printList(); // Output: 15
        scll.insertAtEnd(30);
        scll.insertAtEnd(40);
        scll.printList();//Output: 15 30 40
        scll.searchKey(40); //Key 40 found at position 3.
    }
}





/*
10 15 20 
15 20
15
Invalid position!
15
15 30 40
Key 40 found at position 3.
 */