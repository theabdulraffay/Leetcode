<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box">1769. Minimum Number of Operations to Move All Balls to Each Box</a></h2>
<h3>Medium</h3>
<hr>
<p>You have <code>n</code> boxes. You are given a binary string <code>boxes</code> of length <code>n</code>, where <code>boxes[i]</code> is <code>'0'</code> if the <code>i<sup>th</sup></code> box is empty, and <code>'1'</code> if it contains one ball.</p>

<p>In one operation, you can move one ball from a box to an adjacent box. Box <code>i</code> is adjacent to box <code>j</code> if <code>abs(i - j) == 1</code>. Note that after doing so, there may be more than one ball in some boxes.</p>

<p>Return an array <code>answer</code> of size <code>n</code>, where <code>answer[i]</code> is the minimum number of operations needed to move all the balls to the <code>i<sup>th</sup></code> box.</p>

<p>Each <code>answer[i]</code> is calculated considering the initial state of the boxes.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> boxes = "110"
<strong>Output:</strong> [1,1,3]
<strong>Explanation:</strong> The answer for each box is as follows:
1) First box: you will have to move one ball from the second box to the first box in one operation.
2) Second box: you will have to move one ball from the first box to the second box in one operation.
3) Third box: you will have to move one ball from the first box to the third box in two operations, 
   and move one ball from the second box to the third box in one operation.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> boxes = "001011"
<strong>Output:</strong> [11,8,5,4,3,4]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == boxes.length</code></li>
<li><code>1 <= n <= 2000</code></li>
<li><code>boxes[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li>
</ul>
