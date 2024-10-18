/*
Given a Binary Tree, find maximum and minimum elements in it.

Example:

Input: 
           
Output: 11 1
Explanation: The maximum and minimum element in this binary tree is 11 and 1 respectively.
Input: 
         6
        / \
       5   8
      /
     2
Output: 8 2
Explanation: The maximum and minimum element in this binary tree is 8 and 2 respectively.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= number of nodes <= 105
1 <= data of a node <= 105


 */
//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public static int findMax(Node root){
        if(root==null)
        return Integer.MIN_VALUE;
        else
        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }
    public static int findMin(Node root){
        if(root==null)
        return Integer.MAX_VALUE;
        else
        return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
    }
}

