<h2><a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/">2130. Maximum Twin Sum of a Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.</p>
<p>For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.</p>
<p>The twin sum is defined as the sum of a node and its twin.</p>
<p>Given the head of a linked list with even length, return the maximum twin sum of the linked list.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [5,4,2,1]
<strong>Output:</strong> 6
<strong>Explanation:</strong>
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [4,2,2,3]
<strong>Output:</strong> 7
<strong>Explanation:</strong>
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> head = [1,100000]
<strong>Output:</strong> 100001
<strong>Explanation:</strong>
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the list is an even integer in the range [2, 105].</li>
  <li>1 <= Node.val <= 105</li>
</ul>
