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
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int carry = 0;
        while (curr != null) {
            int sum = curr.val * 2 + carry;
            carry = sum/10;
            curr.val = sum%10;
            if(curr.next == null && carry == 1) {
                curr.next = new ListNode(1);
                break;
            }
            curr = curr.next;
        }

        return reverse(head);

        

        
    }
}
