public class ReverseLinkedList{

    public static class Node{//a single node will be created when we will be making a single object of this class
        int data;
        Node next;//next has type Node as next points to object which is object of Node class(next is reference variable)

        public Node(int data){//Node constructor creation having data as parameter
            this.data=data;
            this.next=null;//initially there is no linking b/w the nodes
        }
    }

    /*special static variable of type Node(head) in linked list to track elements in linked list,used to maintain 
    a reference(points to a location in memory where an object is stored) to the beginning 
    of the linked list. By declaring it as static variable, it become shared across 
    all instances of the class. This means that all instances of the class share the same head value, 
    which can be useful for managing a single linked list across different parts of your program.
*/
    public static  Node head;
    public static int size;//java automatically initializes size variable to zero.
    //size is being kept static as if nodes are added or deleted same 'size' gets ++ or --  

    /*
    addFirst() fxn is not made static,but since we know that main() being static fxn we can call only static fxns in main(). 
    but if we use object to call fxns in that case fxn may be static or non static. 
    Therefore, no need to make addFirst() static necessarily.
     */
    public void addFirst(int new_Data){
        //step1: Allocate the Node & Put in the data
        Node new_Node=new Node(new_Data);
        size++;//no sooner a new node is created size of ll increased by 1

        if(head==null){//base case,no node present linked list empty
            head=new_Node;
            return;
        }
        //step2: Make next of new Node as head 
        new_Node.next=head;
        //step3: Move the head to point to new Node 
        head=new_Node;
    }
    
    public void addLast(int new_Data){
        Node new_Node=new Node(new_Data);
        size++;
        if(head==null){
            head=new_Node;
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
        last.next = new_Node;

    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head; //temp is temporary variable of type Node
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void reverse() {
        
    Node current = head;
    Node previous = null;
    Node nextt ;//we could've used next again, it will act as independent node, having data and next. 
               //But to avoid confusion we used nextt.
    while (current != null) {
        nextt = current.next;
        current.next = previous;//breaking forward connection & providing backward connection
        previous = current;
        current = nextt;
    }
    head=previous;
        }
    
    
        public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();//creates a object of linkedlist class
       
        ll.addFirst(10);
        ll.addLast(8);
        ll.addLast(1); 
        ll.addLast(11);

        ll.print();
        ll.reverse();
        ll.print();
        

        
        
    }
}
/*output: 10->8->1->11->null
11->1->8->10->null*/
/*
Time Complexity: O(N) The code traverses the entire linked list once, where 'n' is the number of nodes in the list. 
This traversal has a linear time complexity, O(n).

Space Complexity: O(1) The code uses only a constant amount of additional space, regardless of the linked list's length. 
This is achieved by using three pointers (current, previous, nextt) to reverse the 
list without any significant extra memory usage, resulting in constant space complexity, O(1).

 */