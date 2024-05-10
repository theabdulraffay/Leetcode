<h2><a href="https://leetcode.com/problems/double-a-number-represented-as-a-linked-list">2816. Double a Number Represented as a Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.</p>
<p>Return the head of the linked list after doubling it.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [1,8,9]
<strong>Output:</strong> [3,7,8]
<strong>Explanation:</strong> The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [9,9,9]
<strong>Output:</strong> [1,9,9,8]
<strong>Explanation:</strong> The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list represents the number 999 * 2 = 1998. 
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the list is in the range [1, 10^4]</li>
<li>0 ≤ Node.val ≤ 9</li>
<li>The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.</li>
</ul>
