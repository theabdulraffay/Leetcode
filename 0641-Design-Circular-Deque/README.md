<h2><a href="https://leetcode.com/problems/design-circular-deque/">641. Design Circular Deque</a></h2>
<h3>Medium</h3>
<hr>
<p>Design your implementation of the circular double-ended queue (deque).</p>

<p>Implement the <code>MyCircularDeque</code> class:</p>

<ul>
<li><code>MyCircularDeque(int k)</code> Initializes the deque with a maximum size of k.</li>
<li><code>boolean insertFront()</code> Adds an item at the front of the Deque. Returns true if the operation is successful, or false otherwise.</li>
<li><code>boolean insertLast()</code> Adds an item at the rear of the Deque. Returns true if the operation is successful, or false otherwise.</li>
<li><code>boolean deleteFront()</code> Deletes an item from the front of the Deque. Returns true if the operation is successful, or false otherwise.</li>
<li><code>boolean deleteLast()</code> Deletes an item from the rear of the Deque. Returns true if the operation is successful, or false otherwise.</li>
<li><code>int getFront()</code> Returns the front item from the Deque. Returns -1 if the deque is empty.</li>
<li><code>int getRear()</code> Returns the last item from the Deque. Returns -1 if the deque is empty.</li>
<li><code>boolean isEmpty()</code> Returns true if the deque is empty, or false otherwise.</li>
<li><code>boolean isFull()</code> Returns true if the deque is full, or false otherwise.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]

<strong>Output:</strong> 
[null, true, true, true, false, 2, true, true, true, 4]

<strong>Explanation:</strong>
MyCircularDeque myCircularDeque = new MyCircularDeque(3);
myCircularDeque.insertLast(1);  // return True
myCircularDeque.insertLast(2);  // return True
myCircularDeque.insertFront(3); // return True
myCircularDeque.insertFront(4); // return False, the queue is full.
myCircularDeque.getRear();      // return 2
myCircularDeque.isFull();       // return True
myCircularDeque.deleteLast();   // return True
myCircularDeque.insertFront(4); // return True
myCircularDeque.getFront();     // return 4
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ k ≤ 1000</li>
<li>0 ≤ value ≤ 1000</li>
<li>At most 2000 calls will be made to <code>insertFront</code>, <code>insertLast</code>, <code>deleteFront</code>, <code>deleteLast</code>, <code>getFront</code>, <code>getRear</code>, <code>isEmpty</code>, and <code>isFull</code>.</li>
</ul>
