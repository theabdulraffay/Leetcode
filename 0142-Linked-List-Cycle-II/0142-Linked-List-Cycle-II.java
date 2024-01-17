/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode lengthOfCycle(ListNode head) {
		ListNode fast = head;
        ListNode slow = head;
        int counter = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            	// do{
        		// 	slow = slow.next;
        		// 	counter++;
        		// }while(slow != fast);
        		// break;
            }
        }
        
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        // int length = lengthOfCycle(head);
    	// if(length == 0)return null;
    	// ListNode slow = head;
    	// ListNode fast = head;
    	// while(length > 0){
    	// 	slow = slow.next;
        //     length--;
    	// }

        ListNode fast = head;
        ListNode slow = lengthOfCycle(head);
        if(slow == null)return slow;
    	while(fast != slow){
    		fast = fast.next;
    		slow = slow.next;
    	}
    	return fast;
        
    }
}
