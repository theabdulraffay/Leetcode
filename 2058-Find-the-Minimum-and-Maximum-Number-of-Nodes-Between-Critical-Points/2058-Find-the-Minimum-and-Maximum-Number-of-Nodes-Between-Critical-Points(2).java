class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int fir = -1;
        int sec = Integer.MAX_VALUE;
        ListNode prev = head;
        head = head.next;
        int index = -1;
        int cur = 2;
        while(head.next != null) {
            if(( prev.val>head.val && head.val<head.next.val   || prev.val<head.val && head.val>head.next.val)) {
                if(index == -1) {
                    fir = cur;
                } else {
                    sec = Math.min(cur - index, sec);
                }
                index = cur;
            }
            cur++;
            prev = head;
            head = head.next;
        }
        if(index == -1 || index - fir == 0) return new int[]{-1, -1};
        return new int[]{sec, index - fir};
        
    }
}
