<h2><a href="https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero">1658. Minimum Operations to Reduce X to Zero</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code> and an integer <code>x</code>. In one operation, you can either remove the leftmost or the rightmost element from the array <code>nums</code> and subtract its value from <code>x</code>. Note that this modifies the array for future operations.</p>

<p>Return the minimum number of operations to reduce <code>x</code> to exactly 0 if it is possible, otherwise, return -1.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,4,2,3], x = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> The optimal solution is to remove the last two elements to reduce x to zero.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,6,7,8,9], x = 4
<strong>Output:</strong> -1
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,2,20,1,1,3], x = 10
<strong>Output:</strong> 5
<strong>Explanation:</strong> The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ nums.length ≤ 10<sup>5</sup></li>
<li>1 ≤ nums[i] ≤ 10<sup>4</sup></li>
<li>1 ≤ x ≤ 10<sup>9</sup></li>
</ul>
