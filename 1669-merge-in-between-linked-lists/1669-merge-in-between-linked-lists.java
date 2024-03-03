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
    ListNode get(int n, ListNode head){
        ListNode temp = head;
        for(int i = 0;i<n;i++){
            temp = temp.next;
        }
        return temp;
    }

    ListNode getLast(ListNode head){
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode a1 = get(a-1, list1);
        ListNode b1 = get(b+1, list1);
        a1.next = list2;
        ListNode tail = getLast(list2);
        tail.next = b1;
        return list1;
        
    }
}
