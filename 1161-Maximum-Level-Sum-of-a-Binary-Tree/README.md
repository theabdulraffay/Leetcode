<h2><a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree">1161. Maximum Level Sum of a Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.</p>
<p>Return the smallest level x such that the sum of all the values of nodes at level x is maximal.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,7,0,7,-8,null,null]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [989,null,10250,98693,-89388,null,null,null,-32127]
<strong>Output:</strong> 2
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 10^4].</li>
<li>-10^5 ≤ Node.val ≤ 10^5</li>
</ul>
