<h2><a href="https://leetcode.com/problems/height-checker">1051. Height Checker</a></h2>
<h3>Easy</h3>
<hr>
<p>A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array <code>expected</code> where <code>expected[i]</code> is the expected height of the <code>i</code>th student in line.</p>

<p>You are given an integer array <code>heights</code> representing the current order that the students are standing in. Each <code>heights[i]</code> is the height of the <code>i</code>th student in line (0-indexed).</p>

<p>Return the number of indices where <code>heights[i] != expected[i]</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> heights = [1,1,4,2,1,3]
<strong>Output:</strong> 3
<strong>Explanation:</strong> 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> heights = [5,1,2,3,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong>
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> heights = [1,2,3,4,5]
<strong>Output:</strong> 0
<strong>Explanation:</strong>
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= heights.length <= 100</code></li>
<li><code>1 <= heights[i] <= 100</code></li>
</ul>
