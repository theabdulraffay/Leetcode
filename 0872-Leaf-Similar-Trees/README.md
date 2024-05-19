<h2><a href="https://leetcode.com/problems/leaf-similar-trees">872. Leaf-Similar Trees</a></h2>
<h3>Easy</h3>
<hr>
<p>Consider all the leaves of a binary tree. From left to right order, the values of those leaves form a leaf value sequence.</p>
<p>Two binary trees are considered leaf-similar if their leaf value sequence is the same.</p>
<p>Return <code>true</code> if and only if the two given trees with head nodes <code>root1</code> and <code>root2</code> are leaf-similar.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root1 = [1,2,3], root2 = [1,3,2]
<strong>Output:</strong> false
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in each tree will be in the range [1, 200].</li>
<li>Both of the given trees will have values in the range [0, 200].</li>
</ul>
