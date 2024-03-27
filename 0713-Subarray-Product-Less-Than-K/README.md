<h2><a href="https://leetcode.com/problems/subarray-product-less-than-k/description/">713. Subarray Product Less Than K</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,5,2,6], k = 100
<strong>Output:</strong> 8
<strong>Explanation:</strong> The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3], k = 0
<strong>Output:</strong> 0
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= nums.length <= 3 * 10^4</li>
  <li>1 <= nums[i] <= 1000</li>
  <li>0 <= k <= 10^6</li>
</ul>
