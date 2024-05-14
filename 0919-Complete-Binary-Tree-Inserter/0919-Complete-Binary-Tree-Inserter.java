/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CBTInserter {
    ArrayList<TreeNode> l = new ArrayList<>();

    public CBTInserter(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        l.add(root);
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                TreeNode temp = que.poll();
                if(temp.left != null) {
                    que.add(temp.left);
                    l.add(temp.left);
                }

                if(temp.right != null) {
                    que.add(temp.right);
                    l.add(temp.right);
                }
            }
        }
    }
    
    public int insert(int val) {
        int parent = (l.size() - 1) / 2;
        TreeNode temp = l.get(parent);
        if (l.size() % 2 == 0) {
            temp.right = new TreeNode(val);
            l.add(temp.right);
        } else {
            temp.left = new TreeNode(val);
            l.add(temp.left);
        }
        return temp.val;
    }
    
    public TreeNode get_root() {
        return l.get(0);
        
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
