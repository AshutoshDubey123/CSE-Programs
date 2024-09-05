/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false
 
Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
The isPalindrome function works by first finding the middle of the linked list, 
then reversing the second half of the list, and finally comparing the first half with the reversed second half. 
If all corresponding nodes are equal, the linked list is a palindrome; otherwise, it is not.
 */
class Solution {
    
    public boolean isPalindrome(ListNode head) {
    if (head==null)
        return true;
        
        ListNode mid=middle(head);
        ListNode last=reverse(mid);
        ListNode current=head;
        
        while(last!=null){

            if(last.val!=current.val)
                return false;
            
            last=last.next;
            current=current.next;
        
        }
        return true;
    }
    
    ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;//fast pointer moves twice as fast as slow
        }
        return slow;
        /*
        [1,2,2,1]:2nd 2 will be returned
        [1,2,3,2,1]: 3 will be returned
         */
    }
    
    ListNode reverse(ListNode head) {

    if(head==null){
    return head;
    }        

    ListNode current = head;
    ListNode previous = null;
    ListNode nextt = null;

    while (current != null) {
    nextt = current.next;
    current.next = previous;
    previous = current;
    current = nextt;
    }

    return previous;
    }
}