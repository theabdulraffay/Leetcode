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
        ListNode getlast(ListNode t){
        ListNode temp = t;
        while(temp.next.next != null){
    		    temp = temp.next;
    	}
    	return temp; 
    }
  
    int length(ListNode head){
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        return c;
    }
  
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        int size = length(head);
        k = k%size;
        for(int i=0; i<k; i++){
    		  ListNode temp = getlast(head);
    	    ListNode temp2 = temp.next; 
    	    temp.next = null; 
    	    temp2.next = head; 
    	    head = temp2;
    	}
        return head;

        
    }
}
