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
    int size(ListNode node) {
        int size = 0;
        while(node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = size(head);
        ListNode[] toret = new ListNode[k];
        int[] arr = new int[k];
        int extre = size % k;
        for(int i = 0; i < extre; i++) {
            arr[i]++;
        }
        extre = size / k;
        for(int i = 0; i < k; i++) {
            arr[i] += extre;
        }
        for(int i = 0; i < arr.length && arr[i] > 0; i++) {
            int n = arr[i];
            ListNode temp = head;
            while(n > 1) {
                head = head.next;
                n--;
            }
            ListNode prev = head;
            head = head.next;
            prev.next = null;
            toret[i] = temp;
        }
        return toret;

        
    }
}
