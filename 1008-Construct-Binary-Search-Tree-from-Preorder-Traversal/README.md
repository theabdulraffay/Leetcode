<h2><a href="https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal">1008. Construct Binary Search Tree from Preorder Traversal</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.</p>
<p>It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.</p>
<p>A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.</p>
<p>A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> preorder = [8,5,1,7,10,12]
<strong>Output:</strong> [8,5,10,1,7,null,12]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> preorder = [1,3]
<strong>Output:</strong> [1,null,3]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= preorder.length <= 100</li>
<li>1 <= preorder[i] <= 1000</li>
<li>All the values of preorder are unique.</li>
</ul>
