<h2><a href="https://leetcode.com/problems/special-array-i">3151. Special Array I</a></h2>
<h3>Easy</h3>
<hr>
<p>An array is considered special if every pair of its adjacent elements contains two numbers with different parity.</p>
<p>You are given an array of integers <code>nums</code>. Return <code>true</code> if <code>nums</code> is a special array, otherwise, return <code>false</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1]
<strong>Output:</strong> true
<strong>Explanation:</strong> There is only one element. So the answer is true.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,4]
<strong>Output:</strong> true
<strong>Explanation:</strong> There are only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,3,1,6]
<strong>Output:</strong> false
<strong>Explanation:</strong> nums[1] and nums[2] are both odd. So the answer is false.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 100</code></li>
  <li><code>1 <= nums[i] <= 100</code></li>
</ul>
