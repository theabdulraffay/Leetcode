<h2><a href="https://leetcode.com/problems/minimize-xor">2429. Minimize XOR</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two positive integers <code>num1</code> and <code>num2</code>, find the positive integer <code>x</code> such that:</p>
<ul>
  <li><code>x</code> has the same number of set bits as <code>num2</code>, and</li>
  <li>The value <code>x XOR num1</code> is <strong>minimal</strong>.</li>
</ul>
<p>Note that <code>XOR</code> is the bitwise XOR operation.</p>
<p>Return <em>the integer </em><code>x</code>. The test cases are generated such that <code>x</code> is <strong>uniquely determined</strong>.</p>
<p>The number of <strong>set bits</strong> of an integer is the number of <code>1</code>'s in its binary representation.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> num1 = 3, num2 = 5
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The binary representations of num1 and num2 are 0011 and 0101, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> num1 = 1, num2 = 12
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The binary representations of num1 and num2 are 0001 and 1100, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>num1, num2</code> ≤ 10<sup>9</sup></li>
</ul>
