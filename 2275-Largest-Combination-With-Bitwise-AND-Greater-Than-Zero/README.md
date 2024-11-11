<h2><a href="https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero">2275. Largest Combination With Bitwise AND Greater Than Zero</a></h2>
<h3>Medium</h3>
<hr>
<p>The bitwise AND of an array <code>nums</code> is the bitwise AND of all integers in <code>nums</code>.</p>

<p>For example, for <code>nums = [1, 5, 3]</code>, the bitwise AND is equal to <code>1 & 5 & 3 = 1</code>.</p>
<p>Also, for <code>nums = [7]</code>, the bitwise AND is 7.</p>

<p>You are given an array of positive integers <code>candidates</code>. Evaluate the bitwise AND of every combination of numbers in <code>candidates</code>. Each number in <code>candidates</code> may only be used once in each combination.</p>

<p>Return the size of the largest combination of candidates with a bitwise AND greater than 0.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> candidates = [16,17,71,62,12,24,14]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The combination [16,17,62,24] has a bitwise AND of 16 & 17 & 62 & 24 = 16 &gt; 0.
The size of the combination is 4.
It can be shown that no combination with a size greater than 4 has a bitwise AND greater than 0.
Note that more than one combination may have the largest size.
For example, the combination [62,12,24,14] has a bitwise AND of 62 & 12 & 24 & 14 = 8 &gt; 0.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> candidates = [8,8]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The largest combination [8,8] has a bitwise AND of 8 & 8 = 8 &gt; 0.
The size of the combination is 2, so we return 2.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 &lt;= candidates.length &lt;= 10<sup>5</sup></code></li>
<li><code>1 &lt;= candidates[i] &lt;= 10<sup>7</sup></code></li>
</ul>