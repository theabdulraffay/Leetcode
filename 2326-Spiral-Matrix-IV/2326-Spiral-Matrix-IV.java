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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for (int[] i : ans) Arrays.fill(i, -1);
        int i = 0;
        int stRow = 0;
        int enCol = ans[0].length - 1;
        int enRow = ans.length - 1;
        int stCol = 0;
        n = n * m;
        while (i < n) {
            for (int j = stRow; j <= enCol && head != null; j++) {
                ans[stRow][j] = head.val;
                head = head.next;
            }
            stRow++;
            if (i == n || head == null)break;

            for (int j = stRow; j <= enRow && head != null; j++) {
                ans[j][enCol] = head.val;
                head = head.next;
            }
            enCol--;
            if (i == n || head == null)break;

            for (int j = enCol; j >= stCol && head != null; j--) {
                ans[enRow][j] = head.val;
                head = head.next;
            }
            enRow--;
            if (i == n || head == null)break;

            for (int j = enRow; j >= stRow && head != null; j--) {
                ans[j][stCol] = head.val;
                head = head.next;
            }
            stCol++;
            if (i == n || head == null)break;

        }
        return ans;
    }
}
