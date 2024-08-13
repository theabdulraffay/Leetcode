class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }

        while(set.contains(head.val) && head.next != null) {
            head.val = head.next.val;
            head.next = head.next.next;
        }
        ListNode temp = head;
        ListNode prev = head;

        while(head != null) {
            if(set.contains(head.val)) {
                prev.next = head.next;
                head = head.next;
                continue;
            }
            prev = head;
            head = head.next;
        }
        return temp;
        
    }
}
