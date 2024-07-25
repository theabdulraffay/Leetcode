/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node toret = new Node(-1);
        HashMap<Node, Integer> index = new HashMap<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int ind = 0;
        Node temp = head;
        Node head2 = toret;
        while(head != null) {
            toret.next = new Node(head.val);
            map.put(ind, toret.next);
            index.put(head, ind++);
            head = head.next;
            toret = toret.next;
        }
        head2 = head2.next;
        toret = head2;

        while(temp != null) {
            if(temp.random != null) {
                int in = index.get(temp.random);
                Node another = map.get(in);
                toret.random = another;
            }
            toret = toret.next;
            temp = temp.next;
        }
        return head2;
        
    }
}ha
