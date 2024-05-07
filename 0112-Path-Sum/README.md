<h2><a href="https://leetcode.com/problems/path-sum">112. Path Sum</a></h2>
<h3>Easy</h3>
<hr>
<p>Given the root of a binary tree and an integer <code>targetSum</code>, return <code>true</code> if the tree has a root-to-leaf path such that adding up all the values along the path equals <code>targetSum</code>.</p>
<p>A leaf is a node with no children.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
<strong>Output:</strong> true
<strong>Explanation:</strong> The root-to-leaf path with the target sum is shown.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3], targetSum = 5
<strong>Output:</strong> false
<strong>Explanation:</strong> There two root-to-leaf paths in the tree:
(1 → 2): The sum is 3.
(1 → 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [], targetSum = 0
<strong>Output:</strong> false
<strong>Explanation:</strong> Since the tree is empty, there are no root-to-leaf paths.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [0, 5000].</li>
<li>-1000 ≤ Node.val ≤ 1000</li>
<li>-1000 ≤ targetSum ≤ 1000</li>
</ul>
