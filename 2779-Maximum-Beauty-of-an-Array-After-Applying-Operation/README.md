<h2><a href="https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation">2779. Maximum Beauty of an Array After Applying Operation</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array <code>nums</code> and a non-negative integer <code>k</code>.</p>

<p>In one operation, you can do the following:</p>
<ul>
  <li>Choose an index <code>i</code> that hasn't been chosen before from the range <code>[0, nums.length - 1]</code>.</li>
  <li>Replace <code>nums[i]</code> with any integer from the range <code>[nums[i] - k, nums[i] + k]</code>.</li>
</ul>
<p>The beauty of the array is the length of the longest subsequence consisting of equal elements.</p>

<p>Return the maximum possible beauty of the array <code>nums</code> after applying the operation any number of times.</p>

<p>Note that you can apply the operation to each index only once.</p>

<p>A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the order of the remaining elements.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,6,1,2], k = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> In this example, we apply the following operations:
- Choose index 1, replace it with 4 (from range [4,8]), nums = [4,4,1,2].
- Choose index 3, replace it with 4 (from range [0,4]), nums = [4,4,1,4].
After the applied operations, the beauty of the array nums is 3 (subsequence consisting of indices 0, 1, and 3).
It can be proven that 3 is the maximum possible length we can achieve.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1,1], k = 10
<strong>Output:</strong> 4
<strong>Explanation:</strong> In this example we don't have to apply any operations.
The beauty of the array nums is 4 (whole array).
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
  <li>0 ≤ <code>nums[i]</code>, <code>k</code> ≤ 10<sup>5</sup></li>
</ul>
