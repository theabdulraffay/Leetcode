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
    ListNode reverse(ListNode node) {
        if(node==null || node.next==null){
            return node;
        }
        ListNode curr = node;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode curr = reverse(head);
        ListNode next = curr.next;
        head = curr;

        while (next != null) {
            while(next != null && next.val < curr.val) {
                next = next.next;
            }
            curr.next = next;
            curr = next;
            if(next != null) next = next.next;
        }
        return reverse(head);
    }
}
