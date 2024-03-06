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
    int size(ListNode n){
        ListNode temp = n;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    ListNode get(int n, ListNode head){
        ListNode temp = head;
        for(int i = 1;i<n;i++){
            temp = temp.next;
        }
        return temp;
    }
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        int size = size(head);
        ListNode t1 = get(k-1, head);
        ListNode t2 = get(size-k, head);
        ListNode first = ((k == 1)? head : t1.next);
        ListNode second = ((size-k == 0)? head :t2.next);
        // int temp = first.val;
        // first.val = second.val;
        // second.val = temp;
        // return head;
        if(size == 2){
            ListNode temp = head;
            head = head.next;
            head.next = temp;
            temp.next = null;
            return head;
        }
        else if(k == 1 || size-k == 0){
            ListNode temp = head;
            t2 = get(size-1, head);
            second = t2.next;
            head = head.next;
            t2.next = t2.next.next;
            second.next = head;
            head = second;
            temp.next = t2.next;
            t2.next = temp;
            return head;
        }
        else if(first == second)return head;
        else if(k+k == size || (k+k) - 2 == size){
            if((k+k) -2== size){first = second;
            second = second.next; t1 = t2;}
            ListNode temp = second.next;
            second.next = first;
            first.next = temp;
            t1.next = second;
            return head;
        }else{

        t1.next = t1.next.next;
        t2.next = t2.next.next;

        first.next = t2.next;
        t2.next = first;

        second.next = t1.next;
        t1.next = second;
        return head;
        }
    }
}
