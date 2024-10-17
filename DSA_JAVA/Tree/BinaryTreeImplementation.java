import java.util.Scanner;

public class BinaryTreeImplementation {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);//left
		System.out.print(root.data+" ");//current node
		inOrder(root.right);//right
		// don't think much, keep recursive leap of faith, recusion will do everything
	}
	
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");//current node
		preOrder(root.left);//left
		preOrder(root.right);//right
	}
	
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);//left
		postOrder(root.right);//right
		System.out.print(root.data+" ");//current node
	}
}
//  Node class represents each node of the binary tree
class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
		//not writing left = right = null; automatically implies they are null for a created node
	}
}
/* Output:
Enter data: 
2
Enter left for 2
Enter data: 
4
Enter left for 4
Enter data: 
7
Enter left for 7
Enter data: 
-1
Enter right for 7
Enter data:
-1
Enter right for 4
Enter data:
-1
Enter right for 2
Enter data:
1
Enter left for 1
Enter data:
8
Enter left for 8
Enter data:
-1
Enter right for 8
Enter data:
-1
Enter right for 1
Enter data:
3
Enter left for 3
Enter data:
-1
Enter right for 3
Enter data:
-1
7 4 2 8 1 3
2 4 7 1 8 3
7 4 8 3 1 2
*/