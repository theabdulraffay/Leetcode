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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode temp = head.next;
        int c = 2;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp.next != null){
            if(temp.val > prev.val && temp.val > temp.next.val){
                list.add(c);
            }else if (temp.val < prev.val && temp.val < temp.next.val){
                list.add(c);
            }
            c++;
            prev = temp;
            temp = temp.next;
        }
        System.out.println(list);
        int fir = -1;
        int sec = -1;
        if(list.size() > 1)
        {
            fir = list.get(list.size() - 1) - list.get(0);
            sec = list.get(list.size() - 1) - list.get(list.size() - 2);
            for(int i = list.size() - 1; i > 0;i--){
                if(list.get(i) - list.get(i - 1) < sec){
                    sec = list.get(i) - list.get(i - 1);
                }
            }
        }
        return new int[]{sec, fir};
    }
}
