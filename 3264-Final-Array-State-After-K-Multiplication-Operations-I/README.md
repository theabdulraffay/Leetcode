<h2><a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i">3264. Final Array State After K Multiplication Operations I</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an integer array <code>nums</code>, an integer <code>k</code>, and an integer <code>multiplier</code>.</p>
<p>You need to perform <code>k</code> operations on <code>nums</code>. In each operation:</p>
<ul>
<li>Find the minimum value <code>x</code> in <code>nums</code>. If there are multiple occurrences of the minimum value, select the one that appears first.</li>
<li>Replace the selected minimum value <code>x</code> with <code>x * multiplier</code>.</li>
</ul>
<p>Return an integer array denoting the final state of <code>nums</code> after performing all <code>k</code> operations.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,3,5,6], k = 5, multiplier = 2
<strong>Output:</strong> [8,4,6,5,6]

<strong>Explanation:</strong>
Operation   Result
1           [2, 2, 3, 5, 6]
2           [4, 2, 3, 5, 6]
3           [4, 4, 3, 5, 6]
4           [4, 4, 6, 5, 6]
5           [8, 4, 6, 5, 6]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2], k = 3, multiplier = 4
<strong>Output:</strong> [16,8]

<strong>Explanation:</strong>
Operation   Result
1           [4, 2]
2           [4, 8]
3           [16, 8]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= nums.length <= 100</code></li>
<li><code>1 <= nums[i] <= 100</code></li>
<li><code>1 <= k <= 10</code></li>
<li><code>1 <= multiplier <= 5</code></li>
</ul>
