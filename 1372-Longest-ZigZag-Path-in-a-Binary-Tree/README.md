<h2><a href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree">1372. Longest ZigZag Path in a Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary tree.</p>
<p>A ZigZag path for a binary tree is defined as follows:</p>
<ul>
<li>Choose any node in the binary tree and a direction (right or left).</li>
<li>If the current direction is right, move to the right child of the current node; otherwise, move to the left child.</li>
<li>Change the direction from right to left or from left to right.</li>
<li>Repeat the second and third steps until you can't move in the tree.</li>
</ul>
<p>Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).</p>
<p>Return the longest ZigZag path contained in that tree.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> Longest ZigZag path in blue nodes (right -> left -> right).
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1,1,1,null,1,null,null,1,1,null,1]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Longest ZigZag path in blue nodes (left -> right -> left -> right).
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 5 * 10<sup>4</sup>].</li>
<li>1 ≤ Node.val ≤ 100</li>
</ul>
