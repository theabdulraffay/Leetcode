<h2><a href="https://leetcode.com/problems/design-linked-list">707. Design Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>Design your implementation of the linked list. You can choose to use a singly or doubly linked list.</p>
<p>A node in a singly linked list should have two attributes: <code>val</code> and <code>next</code>. <code>val</code> is the value of the current node, and <code>next</code> is a pointer/reference to the next node.</p>
<p>If you want to use the doubly linked list, you will need one more attribute <code>prev</code> to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.</p>
<p>Implement the <code>MyLinkedList</code> class:</p>
<ul>
<li><code>MyLinkedList()</code> Initializes the <code>MyLinkedList</code> object.</li>
<li><code>int get(int index)</code> Get the value of the <code>index</code>th node in the linked list. If the index is invalid, return <code>-1</code>.</li>
<li><code>void addAtHead(int val)</code> Add a node of value <code>val</code> before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.</li>
<li><code>void addAtTail(int val)</code> Append a node of value <code>val</code> as the last element of the linked list.</li>
<li><code>void addAtIndex(int index, int val)</code> Add a node of value <code>val</code> before the <code>index</code>th node in the linked list. If <code>index</code> equals the length of the linked list, the node will be appended to the end of the linked list. If <code>index</code> is greater than the length, the node will not be inserted.</li>
<li><code>void deleteAtIndex(int index)</code> Delete the <code>index</code>th node in the linked list, if the index is valid.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
<strong>Output</strong>
[null, null, null, null, 2, null, 3]
<strong>Explanation</strong>
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1-&gt;2-&gt;3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1-&gt;3
myLinkedList.get(1);              // return 3
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>0 ≤ <code>index</code>, <code>val</code> ≤ 1000</li>
<li>Please do not use the built-in LinkedList library.</li>
<li>At most 2000 calls will be made to <code>get</code>, <code>addAtHead</code>, <code>addAtTail</code>, <code>addAtIndex</code> and <code>deleteAtIndex</code>.</li>
</ul>
