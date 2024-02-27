/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {// we have to delete the node given, but for deletion we need a predecessor
                                           // node, as we cannot go back in a Linked List, so we store the value of next
                                           // node in current node and delete the next node :)
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
