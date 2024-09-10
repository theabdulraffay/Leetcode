<h2><a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list">2807. Insert Greatest Common Divisors in Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the head of a linked list <code>head</code>, in which each node contains an integer value.</p>

<p>Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.</p>

<p>Return the linked list after insertion.</p>

<p>The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [18,6,10,3]
<strong>Output:</strong> [18,6,6,2,10,1,3]
<strong>Explanation:</strong> 
The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [7]
<strong>Output:</strong> [7]
<strong>Explanation:</strong> 
The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
There are no pairs of adjacent nodes, so we return the initial linked list.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the list is in the range <code>[1, 5000]</code>.</li>
<li><code>1 <= Node.val <= 1000</code></li>
</ul>
