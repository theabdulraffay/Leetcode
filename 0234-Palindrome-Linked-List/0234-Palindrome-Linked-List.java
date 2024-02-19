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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode previous = null;
        ListNode next = slow.next;
        while(slow != null){
            slow.next = previous;
            previous = slow;
            slow = next;
            if(next != null){
                next = next.next;
            }
        }

        while(head != null && previous != null){
            if(head.val != previous.val){
                return false;
            }
            head = head.next;
            previous = previous.next;
        }
        return true;
    }
}
