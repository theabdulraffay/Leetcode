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
    ListNode temp;
    Random r= new Random();

    public Solution(ListNode head) {
        temp = head;
    }
    
    public int getRandom() {
        int n = r.nextInt(size());
        ListNode t = temp;
        for(int i = 0;i<n; i++){
            t = t.next;
        }
        return t.val;

    }
    int size(){
        ListNode t = temp;
        int c = 0;
        while(t != null){
            c++;
            t = t.next;
        }
        return c;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
