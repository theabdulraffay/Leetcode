<h2><a href="https://leetcode.com/problems/maximum-good-subarray-sum">3026. Maximum Good Subarray Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array <code>nums</code> of length <code>n</code> and a positive integer <code>k</code>.</p>
<p>A <i>subarray</i> of <code>nums</code> is called good if the absolute difference between its first and last element is exactly <code>k</code>. In other words, the subarray <code>nums[i..j]</code> is good if <code>|nums[i] - nums[j]| == k</code>.</p>
<p>Return the maximum sum of a good subarray of <code>nums</code>. If there are no good subarrays, return <code>0</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6], k = 1
<strong>Output:</strong> 11
<strong>Explanation:</strong> 
The absolute difference between the first and last element must be 1 for a good subarray. 
All the good subarrays are: [1,2], [2,3], [3,4], [4,5], and [5,6]. 
The maximum subarray sum is 11 for the subarray [5,6].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,3,2,4,5], k = 3
<strong>Output:</strong> 11
<strong>Explanation:</strong> 
The absolute difference between the first and last element must be 3 for a good subarray. 
All the good subarrays are: [-1,3,2], and [2,4,5]. 
The maximum subarray sum is 11 for the subarray [2,4,5].
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,-2,-3,-4], k = 2
<strong>Output:</strong> -6
<strong>Explanation:</strong> 
The absolute difference between the first and last element must be 2 for a good subarray. 
All the good subarrays are: [-1,-2,-3], and [-2,-3,-4]. 
The maximum subarray sum is -6 for the subarray [-1,-2,-3].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>2 <= nums.length <= 10<sup>5</sup></code></li>
<li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
<li><code>1 <= k <= 10<sup>9</sup></code></li>
</ul>
