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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1, null);
        ListNode head2 = temp;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {carry = 0;}
            ListNode ntemp = new ListNode(sum);
            temp.next = ntemp;
            temp = ntemp;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = carry + l1.val;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {carry = 0;}
            ListNode ntemp = new ListNode(sum);
            temp.next = ntemp;
            temp = ntemp;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = carry + l2.val;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {carry = 0;}
            ListNode ntemp = new ListNode(sum);
            temp.next = ntemp;
            temp = ntemp;
            l2 = l2.next;
        }

        if (carry == 1) {
            ListNode ntemp = new ListNode(carry);
            temp.next = ntemp;
            temp = ntemp;
        }
        return head2.next;
        
    }
}
