<h2><a href="https://leetcode.com/problems/flip-equivalent-binary-trees">951. Flip Equivalent Binary Trees</a></h2>
<h3>Medium</h3>
<hr>
<p>For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.</p>

<p>A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.</p>

<p>Given the roots of two binary trees <code>root1</code> and <code>root2</code>, return <code>true</code> if the two trees are flip equivalent or <code>false</code> otherwise.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
<strong>Output:</strong> true
<strong>Explanation:</strong> We flipped at nodes with values 1, 3, and 5.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root1 = [], root2 = []
<strong>Output:</strong> true
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root1 = [], root2 = [1]
<strong>Output:</strong> false
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in each tree is in the range <code>[0, 100]</code>.</li>
<li>Each tree will have unique node values in the range <code>[0, 99]</code>.</li>
</ul>
