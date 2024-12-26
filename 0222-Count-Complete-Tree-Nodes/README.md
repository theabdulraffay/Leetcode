<h2><a href="https://leetcode.com/problems/count-complete-tree-nodes">222. Count Complete Tree Nodes</a></h2>
<h3>Easy</h3>
<hr>
<p>Given the root of a complete binary tree, return the number of nodes in the tree.</p>

<p>According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between <code>1</code> and <code>2<sup>h</sup></code> nodes inclusive at the last level <code>h</code>.</p>

<p>Design an algorithm that runs in less than <code>O(n)</code> time complexity.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3,4,5,6]
<strong>Output:</strong> 6
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> 0
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range <code>[0, 5 * 10<sup>4</sup>]</code>.</li>
<li><code>0 <= Node.val <= 5 * 10<sup>4</sup></code></li>
<li>The tree is guaranteed to be complete.</li>
</ul>
