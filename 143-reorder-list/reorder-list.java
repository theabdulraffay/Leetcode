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
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)return;
        ListNode fast = head;
    	ListNode slow = head;
    	while(fast.next !=null && fast.next.next != null){
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	ListNode temp = slow.next;
    	slow.next = null;
		ListNode previous = null;
		ListNode current = temp; 
		ListNode next = current.next; 
		while(current != null){
			current.next = previous;
			previous = current;
			current = next;
			if(next != null){
				next = next.next;
			}
		}
		// display(previous);
		// display(head);
		ListNode arzy = head; 
		while(previous != null){
			ListNode t = arzy.next; 
			ListNode m = previous.next;
			arzy.next = previous;
			previous.next = t;
			arzy = t;
			previous = m;
		}
		// display();
		// return head;
        
    }
}