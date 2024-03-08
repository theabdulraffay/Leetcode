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
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = head;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null){
            sum += temp.val;
            if(temp.val == 0){
                temp.val = sum;
                sum = 0;
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        return head.next;
        // ListNode temp = head;
        // ListNode newHead = new ListNode(-1, null);
        // ListNode next = newHead;
        // while(temp.next != null){
        //     int sum = 0;
        //     do{
        //         sum += temp.val;
        //         temp = temp.next;
        //     }while(temp.val != 0);
        //     ListNode node = new ListNode(sum, null);
        //     next.next = node;
        //     next = node;
        // }
        // return newHead.next;

        
    }
}
