<h2><a href="https://leetcode.com/problems/remove-nodes-from-linked-list">2487. Remove Nodes From Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the head of a linked list.</p>
<p>Remove every node which has a node with a greater value anywhere to the right side of it.</p>
<p>Return the head of the modified linked list.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [5,2,13,3,8]
<strong>Output:</strong> [13,8]
<strong>Explanation:</strong> The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [1,1,1,1]
<strong>Output:</strong> [1,1,1,1]
<strong>Explanation:</strong> Every node has value 1, so no nodes are removed.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of the nodes in the given list is in the range [1, 10^5].</li>
<li>1 ≤ Node.val ≤ 10^5</li>
</ul>
