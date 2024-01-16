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
    public void insertLast(int val){

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode ans = new ListNode();
    ListNode tail = ans;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				tail.next = list1;
        tail = list1;
				list1 = list1.next;
			}else{
				tail.next = list2;
        tail = list2;
				list2 = list2.next;
			}
		}

		while(list1 != null){
			  tail.next = list1;
        tail = list1;
				list1 = list1.next;
		}


		while(list2 != null){
			  tail.next = list2;
        tail = list2;
				list2 = list2.next;
		}
		return ans.next;
        
    }
}
