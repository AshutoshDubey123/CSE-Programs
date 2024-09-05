public class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
public static Node head;
public static int size;



//add
public void addFirst(int data){
    Node newNode =new Node(data);
    size++;
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
}
public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=newNode;
        return;
    }
    // Store the head reference in a temporary variable
    Node last = head;

    // Traverse till the last node
    while (last.next != null) {
        last = last.next;
    }

    // Change the next pointer of the
    // last node to point to the new node
    last.next = newNode;
    newNode.prev=last;
}


public void AddAtIndex(int index,int new_Data){
    if (index==0){
        addFirst(new_Data);
        return;
    }
    if (index==size){
        addLast(new_Data);
        return;
    }
    Node new_Node=new Node(new_Data);
    size++;
    Node temp=head;
    int i=0;
    while(i<index-1){
        temp=temp.next;
        i++;
    }
    new_Node.next=temp.next;
    temp.next=new_Node;

    new_Node.prev = temp;
    // If the new node is not the last node, update prev of next node to new node
    if (new_Node.next != null) {
        new_Node.next.prev = new_Node;
    }

}


//search
// Function to find the position of an integer
public int search(int x) {
    Node curr = head;
    int pos = 0;

    // Traverse the doubly linked list
    while (curr != null && curr.data != x) {
        pos++;
        curr = curr.next;
    }

    // If the integer is not present in the list
    if (curr == null || curr.data != x)
        return -1;

    // If the integer is present in the list
    return (pos + 1);
}



//remove
public int removeFirst(){
    if (head==null){
        System.out.println("DLL is empty");;
        return Integer.MIN_VALUE;
    }
     if(size==1){
        int val=head.data;
        head=null;
        size--;
        return val;
     }
     int val=head.data;
     head=head.next;
     head.prev=null;
     size--;
     return val;
}
public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if (size==1){
        int val=head.data;
        head=null;//variable head pointing to nothing 
        //therefore will removed from memory by automatic garbage collector
        //in C you had  to yourself clear the memory
        size=0;
        return val;
    }
    //Without maintaining a reference to the second last node , 
    //it's not possible to remove the last node without traversing the list from the beginning
    //nodes are connected through links and nodes are allocated memory non-contiguously (this is not array) 
    // Find the second last node
    /* this is also true for below code
     Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        
        int val = last.data;
        
        // Update the second-last node's next reference to null
        last.prev.next = null;
        
        // Decrement the size of the list
        size--;
        
        return val;
     */
    Node secondLast = head;
    while (secondLast.next.next != null) {
        secondLast = secondLast.next;
    }
    int val=secondLast.next.data;
    // Delete the last node
    secondLast.next = null;
    size--;
    return val;
    
}

public void removeAtPosition(int pos) {
    if (pos < 1 || pos > size) {
        System.out.println("Invalid Position.");
        return ;
    }
    // If the list is empty
    if (head == null) {
        System.out.println("list is empty");
        return;
    }
    Node curr = head;

    // Traverse to the node at the given position
    for (int i = 1; i < pos; i++) {
        curr = curr.next;
    }


    // Update the previous node's next pointer
    if (curr.prev != null) //checks if this is not only node present
    {
        curr.prev.next = curr.next;
    }

    // Update the next node's prev pointer
    if (curr.next != null) {
        curr.next.prev = curr.prev;
    }

    // If the node to be deleted is the head node
    if (head == curr) {
        head = curr.next;
    }
    size--;
}



//print
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}



public static void main(String[] args) {
    DoublyLL dll=new DoublyLL();//dll is object of type DoublyLL
    dll.addFirst(4);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(5);
    dll.AddAtIndex(2,3);
    dll.print();
    System.out.println(dll.size);

    System.out.println("found at index "+dll.search(4));

    dll.removeFirst();
    dll.print();
    System.out.println(dll.size);
    dll.removeLast();
    dll.print();
    System.out.println(dll.size);
    
    dll.removeAtPosition(3);
    dll.print();
    System.out.println(dll.size);
}    
}
/*
1<->2<->3<->4<->5<->null
5
found at index 4
2<->3<->4<->5<->null
4
2<->3<->4<->null
3
2<->3<->null
2
 */