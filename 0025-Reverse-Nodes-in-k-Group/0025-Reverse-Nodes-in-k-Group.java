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
    boolean yes(ListNode n, int k) {
        for (int i = 0; i < k; i++) {
            if (n == null)
                return false;
            n = n.next;
        }
        return true;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode last = null;
        ListNode temp = head;
        ListNode current = head;
        while (temp != null) {
            if (yes(temp, k)) { // this check whether the next k node are avalible ot not, because we can only
                                // swap k nodes, if k nodes are not avalible we donot reverse
                for (int i = 0; i < k; i++) {
                    if (temp != null) {
                        ListNode n = temp.next;
                        temp.next = prev;
                        prev = temp;
                        temp = n;
                    }
                }
            } else {
                break;
            }
            if (last == null) {
                head = prev;
                last = prev;
            } else {
                last.next = prev;
                last = prev;
            }
            current.next = temp;
            last = current;
            current = temp;

        }
        return head;
    }
}
