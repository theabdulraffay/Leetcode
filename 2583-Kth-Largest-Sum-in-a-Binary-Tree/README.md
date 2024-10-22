<h2><a href="https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree">2583. Kth Largest Sum in a Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary tree and a positive integer <code>k</code>.</p>

<p>The level sum in the tree is the sum of the values of the nodes that are on the same level.</p>

<p>Return the <code>k</code>th largest level sum in the tree (not necessarily distinct). If there are fewer than <code>k</code> levels in the tree, return <code>-1</code>.</p>

<p>Note that two nodes are on the same level if they have the same distance from the root.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [5,8,9,2,1,3,7,4,6], k = 2
<strong>Output:</strong> 13
<strong>Explanation:</strong> The level sums are the following:
- Level 1: 5.
- Level 2: 8 + 9 = 17.
- Level 3: 2 + 1 + 3 + 7 = 13.
- Level 4: 4 + 6 = 10.
The 2nd largest level sum is 13.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,null,3], k = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong> The largest level sum is 3.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is <code>n</code>.</li>
<li><code>2 <= n <= 10<sup>5</sup></code></li>
<li><code>1 <= Node.val <= 10<sup>6</sup></code></li>
<li><code>1 <= k <= n</code></li>
</ul>
