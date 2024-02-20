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
        int length(ListNode head){
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        return c;
    }
  
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)return null;
        int size = length(head);
        n = size - n;
        ListNode temp = head;
        if(n == 0)return head.next;
        for(int i = 0;i<n-1;i++){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
        
    }
}
