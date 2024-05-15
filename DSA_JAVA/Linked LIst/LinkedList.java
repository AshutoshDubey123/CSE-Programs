public class LinkedList{

    public static class Node{//a single node will be created when we will be making a single object of this class
        int data;
        Node next;//next has type Node as next points to object which is object of Node class(next is reference variable)

        public Node(int data){//Node constructor creation having data as parameter
            this.data=data;
            this.next=null;//initially there is no linking b/w the nodes
        }
    }

    /*special static variable of type Node(head and tail) in linked list to track elements in linked list,used to maintain 
    a reference(points to a location in memory where an object is stored) to the beginning 
    and end of the linked list, respectively. By declaring them as static variables, they become shared across 
    all instances of the class. This means that all instances of the class share the same head and tail values, 
    which can be useful for managing a single linked list across different parts of your program.
*/
    public static  Node head;
    public static  Node tail;
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
            head=tail=new_Node;
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
            head=tail=new_Node;
            return;
        }
        tail.next=new_Node;
        tail=new_Node;

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

    }
    public int removeFirst(){//return type int to return node value/data removed.we aren't printing returned value but 
                            //it may be used as required
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;//not returning a valid number
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
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
            head=tail=null;//variable head and tail pointing to nothing 
            //therefor will removed from memory by automatic garbage collector
            //in C you had  to yourself clear the memory
            size=0;
            return val;
        }
        //Without maintaining a reference to the second last node , 
        //it's not possible to remove the last node without traversing the list from the beginning
        //this is not array that you'll use tail-1, nodes are connected through links and nodes are allocated memory non-contiguously
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        int val=temp.next.data;//or  int val=tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public int removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return Integer.MIN_VALUE;
        }
       
        if (index == 0) {
            
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
    
       
        //we traverse the list until we reach the node just before the index we want to delete 
     
        
       /*  Once we find the node just before the index, we update the next reference of the previous node  to 
        skip the node at the given index (current.next).
        Skip or delete the node at the given index by breaking the link*/
       
        int val;
        Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }

    val = temp.next.data;
    temp.next = temp.next.next;
    size--;
    return val;
    }
    public int iterativeSearch(int key){//is like linear search
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();//creates a object of linkedlist class
       
        ll.addFirst(2);
        
        ll.addFirst(1);
       
        ll.addLast(4);
        
        ll.addLast(5);

        ll.AddAtIndex(2, 3);

        ll.print();//1->2->3->4->5->null
        System.out.println(ll.size);//5

        ll.removeFirst();
        ll.print();//2->3->4->5->null
        System.out.println(ll.size);//4

        ll.removeLast();
        ll.print();//2->3->4->null
        System.out.println(ll.size);//3

        ll.removeAtIndex(2);
        ll.print();//2->3->null
        System.out.println(ll.size);//2

        ll.addFirst(1);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();//1->2->3->6->7->null
        System.out.println(ll.size);//5

        System.out.println(ll.iterativeSearch(7));//4
        System.out.println(ll.iterativeSearch(10));//-1
/*
1->2->3->4->5->null
5
2->3->4->5->null
4
2->3->4->null
3
2->3->null
2
1->2->3->6->7->null
5
4
-1
*/


        
        
    }
}
