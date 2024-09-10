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
    static int gcd(int a, int b)
    {
        // // Find Minimum of a and b
        // int result = Math.min(a, b);
        // while (result > 0) {
        //     if (a % result == 0 && b % result == 0) {
        //         break;
        //     }
        //     result--;
        // }

        // // Return gcd of a and b
        // return result;
        int div = 0;
        if(a<b)
        {
            a = a + b;
            b = a - b;
            a = a - b; 
        }
        while(b != 0)
        {
            div = a / b;
            int rem = a % b ;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null) {
            ListNode arr = new ListNode(gcd(temp.val, temp.next.val));
            arr.next = temp.next;
            temp.next = arr;
            temp = arr.next;
            // ListNode hehe = temp;
            // temp = temp.next;
            // hehe.next = arr;
            // arr.next = temp;
        }
        return head;
        
    }
}
