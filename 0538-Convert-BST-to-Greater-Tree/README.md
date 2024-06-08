<h2><a href="https://leetcode.com/problems/convert-bst-to-greater-tree">538. Convert BST to Greater Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.</p>
<p>As a reminder, a binary search tree is a tree that satisfies these constraints:</p>
<ul>
  <li>The left subtree of a node contains only nodes with keys less than the node's key.</li>
  <li>The right subtree of a node contains only nodes with keys greater than the node's key.</li>
  <li>Both the left and right subtrees must also be binary search trees.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
<strong>Output:</strong> [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [0,null,1]
<strong>Output:</strong> [1,null,1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree is in the range [0, 10<sup>4</sup>].</li>
  <li>-10<sup>4</sup> ≤ Node.val ≤ 10<sup>4</sup></li>
  <li>All the values in the tree are unique.</li>
  <li>root is guaranteed to be a valid binary search tree.</li>
</ul>
