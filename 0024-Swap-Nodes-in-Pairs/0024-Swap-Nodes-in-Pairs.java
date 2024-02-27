/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode last = null;
        ListNode temp = head;
        ListNode current = head;
        while (current != null) {
            for (int i = 0; i < 2 && temp != null; i++) {
                ListNode n = temp.next;
                temp.next = prev;
                prev = temp;
                temp = n;
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            current.next = temp;
            last = current;
            current = temp;
        }
        return head;
    }
}
