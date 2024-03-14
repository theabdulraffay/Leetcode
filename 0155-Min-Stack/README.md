<h2><a href="https://leetcode.com/problems/min-stack/description/">155. Min Stack</a></h2>

<hr>
<p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.</p>
<p>Implement the MinStack class:</p>
<ul>
  <li>MinStack() initializes the stack object.</li>
  <li>void push(int val) pushes the element val onto the stack.</li>
  <li>void pop() removes the element on the top of the stack.</li>
  <li>int top() gets the top element of the stack.</li>
  <li>int getMin() retrieves the minimum element in the stack.</li>
</ul>
<p>You must implement a solution with O(1) time complexity for each function.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
<strong>Output</strong>
[null,null,null,null,-3,null,0,-2]
<strong>Explanation</strong>
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>-231 <= val <= 231 - 1</li>
  <li>Methods pop, top and getMin operations will always be called on non-empty stacks.</li>
  <li>At most 3 * 104 calls will be made to push, pop, top, and getMin.</li>
</ul>
