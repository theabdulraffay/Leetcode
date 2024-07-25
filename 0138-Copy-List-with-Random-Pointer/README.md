<h2><a href="https://leetcode.com/problems/copy-list-with-random-pointer">138. Copy List with Random Pointer</a></h2>
<h3>Medium</h3>
<hr>
<p>A linked list of length <code>n</code> is given such that each node contains an additional random pointer, which could point to any node in the list, or <code>null</code>.</p>

<p>Construct a deep copy of the list. The deep copy should consist of exactly <code>n</code> brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the <code>next</code> and <code>random</code> pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.</p>

<p>For example, if there are two nodes <code>X</code> and <code>Y</code> in the original list, where <code>X.random --> Y</code>, then for the corresponding two nodes <code>x</code> and <code>y</code> in the copied list, <code>x.random --> y</code>.</p>

<p>Return the head of the copied linked list.</p>

<p>The linked list is represented in the input/output as a list of <code>n</code> nodes. Each node is represented as a pair of <code>[val, random_index]</code> where:</p>

<ul>
<li><code>val</code>: an integer representing <code>Node.val</code></li>
<li><code>random_index</code>: the index of the node (range from <code>0</code> to <code>n-1</code>) that the <code>random</code> pointer points to, or <code>null</code> if it does not point to any node.</li>
</ul>

<p>Your code will only be given the head of the original linked list.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
<strong>Output:</strong> [[7,null],[13,0],[11,4],[10,2],[1,0]]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [[1,1],[2,1]]
<strong>Output:</strong> [[1,1],[2,1]]
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> head = [[3,null],[3,0],[3,null]]
<strong>Output:</strong> [[3,null],[3,0],[3,null]]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>0 ≤ <code>n</code> ≤ 1000</li>
<li>-10<sup>4</sup> ≤ <code>Node.val</code> ≤ 10<sup>4</sup></li>
<li><code>Node.random</code> is <code>null</code> or is pointing to some node in the linked list.</li>
</ul>
