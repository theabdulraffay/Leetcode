<h2><a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal">889. Construct Binary Tree from Preorder and Postorder Traversal</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two integer arrays, <code>preorder</code> and <code>postorder</code> where <code>preorder</code> is the preorder traversal of a binary tree of distinct values and <code>postorder</code> is the postorder traversal of the same tree, reconstruct and return the binary tree.</p>
<p>If there exist multiple answers, you can return any of them.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
<strong>Output:</strong> [1,2,3,4,5,6,7]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> preorder = [1], postorder = [1]
<strong>Output:</strong> [1]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>preorder.length</code> <= 30</li>
  <li>1 <= <code>preorder[i]</code> <= <code>preorder.length</code></li>
  <li>All the values of <code>preorder</code> are unique.</li>
  <li><code>postorder.length == preorder.length</code></li>
  <li>1 <= <code>postorder[i]</code> <= <code>postorder.length</code></li>
  <li>All the values of <code>postorder</code> are unique.</li>
  <li>It is guaranteed that <code>preorder</code> and <code>postorder</code> are the preorder traversal and postorder traversal of the same binary tree.</li>
</ul>
