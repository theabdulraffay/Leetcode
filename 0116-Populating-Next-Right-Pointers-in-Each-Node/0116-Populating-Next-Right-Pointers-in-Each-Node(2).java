/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
     	Queue<Node> queue = new LinkedList<Node>(); // This will maintain the left to right all the nodes of the a same level
     	queue.add(root);

     	while(!queue.isEmpty()) {
     		int levelSize = queue.size(); 
     		for(int i = 0; i < levelSize; i++) { 
     			Node temp = queue.poll();
     			if(i != levelSize - 1) {
     				temp.next = queue.peek();
     			}
     			if(temp.left != null) { queue.add(temp.left); }
     			if(temp.right != null) { queue.add(temp.right); }
     		}
     	}
     	return root;
        
    }
}
