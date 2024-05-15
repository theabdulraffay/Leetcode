<h2><a href="https://leetcode.com/problems/linked-list-in-binary-tree">1367. Linked List in Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary tree <code>root</code> and a linked list with head as the first node.</p>
<p>Return <code>True</code> if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return <code>False</code>.</p>
<p>In this context downward path means a path that starts at some node and goes downwards.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
<strong>Output:</strong> true
<strong>Explanation:</strong> Nodes in blue form a subpath in the binary Tree.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
<strong>Output:</strong> true
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no path in the binary tree that contains all the elements of the linked list from head.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree will be in the range [1, 2500].</li>
<li>The number of nodes in the list will be in the range [1, 100].</li>
<li>1 ≤ <code>Node.val</code> ≤ 100 for each node in the linked list and binary tree.</li>
</ul>
