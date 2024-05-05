<h2><a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst">230. Kth Smallest Element in a BST</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [3,1,4,null,2], k = 1
<strong>Output:</strong> 1
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [5,3,6,2,4,null,null,1], k = 3
<strong>Output:</strong> 3
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is n.</li>
<li>1 ≤ k ≤ n ≤ 10^4</li>
<li>0 ≤ Node.val ≤ 10^4</li>
</ul>
<p><strong>Follow up:</strong> If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?</p>
