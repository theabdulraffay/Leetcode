class Solution {
    int index(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder.length == 0) return null;
        if(preorder.length == 1) return new TreeNode(preorder[0]);
        
        TreeNode root = new TreeNode(preorder[0]);
        int leftLength = index(postorder, preorder[1]) + 1;
        
        root.left = constructFromPrePost(
            Arrays.copyOfRange(preorder, 1, leftLength + 1),
            Arrays.copyOfRange(postorder, 0, leftLength)
        );
        
        root.right = constructFromPrePost(
            Arrays.copyOfRange(preorder, leftLength + 1, preorder.length),
            Arrays.copyOfRange(postorder, leftLength, postorder.length - 1)
        );
        
        return root;
    }
}
