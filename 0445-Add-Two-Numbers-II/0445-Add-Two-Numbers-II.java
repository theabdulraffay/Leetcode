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
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = reverse(l1);
        ListNode m = reverse(l2);

        ListNode n = new ListNode (-1);
        ListNode head = n;

        int carry = 0;
        while(l != null && m != null) {
            int sum = l.val + m.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            n.next = new ListNode (sum);
            n = n.next;
            l = l.next;
            m = m.next;
        }

        while(l != null) {
            int sum = l.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            n.next = new ListNode (sum);
            n = n.next;
            l = l.next;
        }


        while(m != null) {
            int sum = m.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            n.next = new ListNode (sum);
            n = n.next;
            m = m.next;
        }

        if(carry == 1) {
            n.next = new ListNode (1);
        }

        return reverse(head.next);

        
    }
}
