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
    public ListNode middleNode(ListNode head) {
        // int c = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     c++;
        //     temp = temp.next;
        // }
        // ListNode te = head;
        // for(int i = 0;i<c/2;i++){
        //      te = te.next;
        // }
        // return te;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
}
