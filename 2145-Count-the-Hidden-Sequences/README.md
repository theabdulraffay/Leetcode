<h2><a href="https://leetcode.com/problems/count-the-hidden-sequences">2145. Count the Hidden Sequences</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array of <code>n</code> integers <code>differences</code>, which describes the differences between each pair of consecutive integers of a hidden sequence of length <code>(n + 1)</code>. More formally, call the hidden sequence <code>hidden</code>, then we have that <code>differences[i] = hidden[i + 1] - hidden[i]</code>.</p>
<p>You are further given two integers <code>lower</code> and <code>upper</code> that describe the inclusive range of values <code>[lower, upper]</code> that the hidden sequence can contain.</p>
<p>For example, given <code>differences = [1, -3, 4]</code>, <code>lower = 1</code>, <code>upper = 6</code>, the hidden sequence is a sequence of length 4 whose elements are in between 1 and 6 (inclusive).</p>
<p>[3, 4, 1, 5] and [4, 5, 2, 6] are possible hidden sequences.</p>
<p>[5, 6, 3, 7] is not possible since it contains an element greater than 6.</p>
<p>[1, 2, 3, 4] is not possible since the differences are not correct.</p>
<p>Return the number of possible hidden sequences there are. If there are no possible sequences, return 0.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> differences = [1,-3,4], lower = 1, upper = 6
<strong>Output:</strong> 2
<strong>Explanation:</strong> The possible hidden sequences are:
- [3, 4, 1, 5]
- [4, 5, 2, 6]
Thus, we return 2.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> differences = [3,-4,5,1,-2], lower = -4, upper = 5
<strong>Output:</strong> 4
<strong>Explanation:</strong> The possible hidden sequences are:
- [-3, 0, -4, 1, 2, 0]
- [-2, 1, -3, 2, 3, 1]
- [-1, 2, -2, 3, 4, 2]
- [0, 3, -1, 4, 5, 3]
Thus, we return 4.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> differences = [4,-7,2], lower = 3, upper = 6
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no possible hidden sequences. Thus, we return 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == differences.length</code></li>
  <li>1 <= <code>n</code> <= 10<sup>5</sup></li>
  <li>-10<sup>5</sup> <= <code>differences[i]</code> <= 10<sup>5</sup></li>
  <li>-10<sup>5</sup> <= <code>lower</code> <= <code>upper</code> <= 10<sup>5</sup></li>
</ul>
