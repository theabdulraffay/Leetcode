<h2><a href="https://leetcode.com/problems/sum-root-to-leaf-numbers">129. Sum Root to Leaf Numbers</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary tree containing digits from 0 to 9 only.</p>
<p>Each root-to-leaf path in the tree represents a number.</p>
<p>For example, the root-to-leaf path 1 -&gt; 2 -&gt; 3 represents the number 123.</p>
<p>Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.</p>
<p>A leaf node is a node with no children.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3]
<strong>Output:</strong> 25
<strong>Explanation:</strong>
The root-to-leaf path 1-&gt;2 represents the number 12.
The root-to-leaf path 1-&gt;3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [4,9,0,5,1]
<strong>Output:</strong> 1026
<strong>Explanation:</strong>
The root-to-leaf path 4-&gt;9-&gt;5 represents the number 495.
The root-to-leaf path 4-&gt;9-&gt;1 represents the number 491.
The root-to-leaf path 4-&gt;0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 1000].</li>
<li>0 ≤ Node.val ≤ 9</li>
<li>The depth of the tree will not exceed 10.</li>
</ul>
