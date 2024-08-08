<h2><a href="https://leetcode.com/problems/count-number-of-nice-subarrays">1248. Count Number of Nice Subarrays</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code> and an integer <code>k</code>. A continuous subarray is called nice if there are <code>k</code> odd numbers on it.</p>

<p>Return the number of nice sub-arrays.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,2,1,1], k = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,4,6], k = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no odd numbers in the array.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,2,2,1,2,2,1,2,2,2], k = 2
<strong>Output:</strong> 16
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 50000</code></li>
  <li><code>1 <= nums[i] <= 10^5</code></li>
  <li><code>1 <= k <= nums.length</code></li>
</ul>
