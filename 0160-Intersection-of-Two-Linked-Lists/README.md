<h2><a href="https://leetcode.com/problems/intersection-of-two-linked-lists">160. Intersection of Two Linked Lists</a></h2>
<h3>Easy</h3>
<hr>
<p>Given the heads of two singly linked-lists <code>headA</code> and <code>headB</code>, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return <code>null</code>.</p>

<p>For example, the following two linked lists begin to intersect at node c1:</p>

<p><img src="https://assets.leetcode.com/uploads/2021/03/05/160_statement.png" alt="Example of two intersecting linked lists"></p>

<p>The test cases are generated such that there are no cycles anywhere in the entire linked structure.</p>

<p>Note that the linked lists must retain their original structure after the function returns.</p>

<p><strong>Custom Judge:</strong></p>
<p>The inputs to the judge are given as follows (your program is not given these inputs):</p>
<ul>
  <li><code>intersectVal</code> - The value of the node where the intersection occurs. This is 0 if there is no intersected node.</li>
  <li><code>listA</code> - The first linked list.</li>
  <li><code>listB</code> - The second linked list.</li>
  <li><code>skipA</code> - The number of nodes to skip ahead in <code>listA</code> (starting from the head) to get to the intersected node.</li>
  <li><code>skipB</code> - The number of nodes to skip ahead in <code>listB</code> (starting from the head) to get to the intersected node.</li>
</ul>
<p>The judge will then create the linked structure based on these inputs and pass the two heads, <code>headA</code> and <code>headB</code> to your program. If you correctly return the intersected node, then your solution will be accepted.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
<strong>Output:</strong> Intersected at '8'
<strong>Explanation:</strong> The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
<strong>Output:</strong> Intersected at '2'
<strong>Explanation:</strong> The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
<strong>Output:</strong> No intersection
<strong>Explanation:</strong> From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes of <code>listA</code> is in the range <code>[0, 3 * 10<sup>4</sup>]</code>.</li>
  <li>The number of nodes of <code>listB</code> is in the range <code>[0, 3 * 10<sup>4</sup>]</code>.</li>
  <li><code>1 <= Node.val <= 10<sup>5</sup></code></li>
  <li><code>0 <= skipA < listA.length</code></li>
  <li><code>0 <= skipB < listB.length</code></li>
  <li><code>intersectVal</code> is 0 if <code>listA</code> and <code>listB</code> do not intersect.</li>
  <li><code>intersectVal == listA[skipA] == listB[skipB]</code> if <code>listA</code> and <code>listB</code> intersect.</li>
</ul>

<p><strong>Follow up:</strong> Could you write a solution that runs in <code>O(m + n)</code> time and uses only <code>O(1)</code> memory?</p>
