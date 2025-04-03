<h2><a href="https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i">2873. Maximum Value of an Ordered Triplet I</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code>.</p>
<p>Return the maximum value over all triplets of indices <code>(i, j, k)</code> such that <code>i < j < k</code>. If all such triplets have a negative value, return <code>0</code>.</p>
<p>The value of a triplet of indices <code>(i, j, k)</code> is equal to <code>(nums[i] - nums[j]) * nums[k]</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [12,6,1,2,7]
<strong>Output:</strong> 77
<strong>Explanation:</strong> The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
It can be shown that there are no ordered triplets of indices with a value greater than 77.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,10,3,4,19]
<strong>Output:</strong> 133
<strong>Explanation:</strong> The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
It can be shown that there are no ordered triplets of indices with a value greater than 133.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>3 <= <code>nums.length</code> <= 100</li>
  <li>1 <= <code>nums[i]</code> <= 10<sup>6</sup></li>
</ul>
