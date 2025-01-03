<h2><a href="https://leetcode.com/problems/number-of-ways-to-split-array">2270. Number of Ways to Split Array</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code> of length <code>n</code>.</p>
<p><code>nums</code> contains a valid split at index <code>i</code> if the following are true:</p>
<ul>
  <li>The sum of the first <code>i + 1</code> elements is greater than or equal to the sum of the last <code>n - i - 1</code> elements.</li>
  <li>There is at least one element to the right of <code>i</code>. That is, <code>0 <= i < n - 1</code>.</li>
</ul>
<p>Return the number of valid splits in <code>nums</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,4,-8,7]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
There are three ways of splitting nums into two non-empty parts:
- Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
- Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
- Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
Thus, the number of valid splits in nums is 2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,3,1,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
There are two valid splits in nums:
- Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 >= 1, i = 1 is a valid split. 
- Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 >= 0, i = 2 is a valid split.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 <= nums.length <= 10<sup>5</sup></code></li>
  <li><code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code></li>
</ul>
