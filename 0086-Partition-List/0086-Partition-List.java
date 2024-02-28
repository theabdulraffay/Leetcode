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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = head, even = head;
        while (odd != null) {// This function will find the first node that is smaller than x, then we will
                             // say this node as head because this is where the LL will start
            if (odd.val < x)
                break;
            odd = odd.next;
        }
        while (even != null) {// This function will find the first node that is greater or equal to x, then we
                              // will keep adding new nodes to this nodes that are greater or equal to this
                              // one
            if (even.val >= x)
                break;
            even = even.next;
        }
        if (odd == null || even == null)
            return head;// this any of these nodes are null this means the there is no element smaller
                        // or greater than x so we return list as it is
        ListNode newEven = even;// newEven will be the first node greater or equal to x, so after all the
                                // modiications we connect odd with newEven
        ListNode temp = head;
        head = odd; // as odd is the first node that is smaller than x, so we start the list from
                    // there sayn it as head
        while (temp != null) {
            if (temp == odd || temp == even) {
                temp = temp.next;
                continue;
            } else if (temp.val < x) {
                odd.next = temp;
                odd = temp;
            } else if (temp.val >= x) {
                even.next = temp;
                even = temp;
            }
            temp = temp.next;
        }
        odd.next = newEven;
        even.next = null;// we make this null to complete(null the tail.next) the list other wise it
                         // forms a circle
        return head;

    }
}
